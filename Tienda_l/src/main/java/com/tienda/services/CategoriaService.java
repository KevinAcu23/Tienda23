package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se propone la firma de un metodo para recuperar los regstros de la tabla categoria 
    public List<Categoria> getCategorias(boolean activo);
    
    //Se programa el codigo para obtener una categoria
    public Categoria getCategoria(Categoria categoria);
    
    //Se actuliza  se crea un registro que tenga el mismo idCategoria
    //Si el objeo tiene un valor en idCategoria, lo busca... si lo encuentra
    //id actualuza sino... lo crea
    public void save(Categoria categoria);
    
    //Se elimina el registro que tenga el idCategoria pasado por parametro
    public void delete(Categoria categoria);
}