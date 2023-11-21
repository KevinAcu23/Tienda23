package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")

public class Usuario implements Serializable {
    
    private static final long serialVersionUID=1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idCategoria;
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_usuario",updatable=false)
    List<Rol> roles;

    public Long getIdUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

   
    }

    
    

