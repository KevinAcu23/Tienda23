package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    //Ya no se utiliza porque esta el manytoone private Long idCategoria;
    private String descripcion;
    private String detalle;
    public double precio;
    public int existencias;
    private String rutaImagen;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_Categoria")
    Categoria categoria;

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencia, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencia;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

}
