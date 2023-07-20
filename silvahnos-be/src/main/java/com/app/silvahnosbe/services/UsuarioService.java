package com.app.silvahnosbe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.silvahnosbe.entities.UsuarioEntity;
import com.app.silvahnosbe.repositories.UsuarioRepository;

/**
 *servicios usuario
 * @author Ignacio Grez
 */

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;


    /**
     *funcion que permite la obtencio de todos los usuarios
     * @return lista de usuarios
     */

    public List<UsuarioEntity> obtenerUsuarios(){
        return (List<UsuarioEntity>) usuarioRepository.findAll();
    }

    /**
     * funcion que permite guardar un usuario
     * @param usuario
     * @return retorna el usuario guardado
     */

    public UsuarioEntity guardarUsuario(UsuarioEntity usuario){
        return usuarioRepository.save(usuario);
    }


    /**
     *funcion que permite obtener un usuario por su nombre
     * @param usuario
     * @return retorna el usuario si existe ,caso contrario retorna null
     */

    public UsuarioEntity obtenerUsuarioPorUsuario(String usuario){
        //revisar cuando no se encuentra el usuario
        return usuarioRepository.findByUsuario(usuario).orElse(null);
    }

}