package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Jardineiro;
import com.sejaumbu.umbu.models.Usuario;
import com.sejaumbu.umbu.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository dbConnection;

    @PostMapping("/cadastrar")
    public Usuario cadastrarUsuario(@RequestBody Usuario novoUsuario) {
        return dbConnection.save(novoUsuario);
    }

    @PutMapping("/alterar")
    public Usuario alterarUsuario(@RequestBody Usuario usuarioAlterado) {
        return dbConnection.save(usuarioAlterado);
    }

    @CrossOrigin
    @GetMapping("/")
    public List<Usuario>findAllRecords() {
        return dbConnection.findAll();
    }
}
