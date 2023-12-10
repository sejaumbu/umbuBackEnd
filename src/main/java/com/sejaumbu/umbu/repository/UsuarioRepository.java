package com.sejaumbu.umbu.repository;

import com.sejaumbu.umbu.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{

}
