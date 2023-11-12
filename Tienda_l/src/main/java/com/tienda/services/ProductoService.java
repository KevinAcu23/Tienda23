package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Se propone la firma de un metodo para recuperar los regstros de la tabla producto 
    public List<Producto> getProductos(boolean activo);

    //Se programa el codigo para obtener una producto
    public Producto getProducto(Producto producto);

    //Se actuliza  se crea un registro que tenga el mismo idProducto
    //Si el objeo tiene un valor en idProducto, lo busca... si lo encuentra
    //id actualuza sino... lo crea
    public void save(Producto producto);

    //Se elimina el registro que tenga el idProducto pasado por parametro
    public void delete(Producto producto);

    //Devuelve la lista de productos filtrados...
    public List<Producto> consultaQuery(
            double precioInf,
            double precioSup);
    
    //Devuelve la lista de productos filtrados con JPQL...
     public List<Producto> consultaJPQL(
            double precioInf,
            double precioSup);
     
     public List<Producto> consultaSQL(
            double precioInf,
            double precioSup);
}
