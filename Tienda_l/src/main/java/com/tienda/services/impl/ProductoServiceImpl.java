package com.tienda.services.impl;

import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import com.tienda.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activo) {
        var productos = productoDao.findAll();
        
        if(activo) {
            productos.removeIf(e -> !e.isActivo());
        }
        
        return productos;
    }

    @Override
    @Transactional(readOnly=true) //Cuando no se va a modificar la base de datos
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null); //orElse: si no lo encuentra devuelve null
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Producto> consultaQuery(
            double precioInf,
            double precioSup) {
    return productoDao.findByPrecioBetweenOrderByDescripcion(0, 0);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Producto> consultaJPQL(
            double precioInf,
            double precioSup) {
    return productoDao.consultaJPQL(0, 0);
    }
    
       @Override
    @Transactional(readOnly=true)
    public List<Producto> consultaSQL(
            double precioInf,
            double precioSup) {
    return productoDao.consultaJPQL(0, 0);
    }
    

    
}
