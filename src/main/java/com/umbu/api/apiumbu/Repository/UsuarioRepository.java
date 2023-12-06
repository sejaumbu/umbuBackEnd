package com.umbu.api.apiumbu.Repository;

import com.umbu.api.apiumbu.Model.Usuario;
import org.springframework.beans.factory.Aware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{
}
