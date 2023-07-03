package com.app.silvahnosbe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {
    @Id
    @Column(unique = true, nullable = false)
    private Long id;
    
    private String correo;
    
    private String usuario;
    private String contrasenna;
    private String rol;
}