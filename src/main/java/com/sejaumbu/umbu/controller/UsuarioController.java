package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Usuario;
import com.sejaumbu.umbu.repository.UsuarioRepository;
import com.sejaumbu.umbu.service.UsuarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository dbConnection;

    @Autowired
    private UsuarioServico us;

    @GetMapping("/listar")
    public Iterable<Usuario> listar() {
        return us.listar();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Usuario novoUsuario) {
        return us.cadastrarAlterar(novoUsuario, "cadastrar");
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody Usuario novoUsuario) {
        return us.cadastrarAlterar(novoUsuario, "alterar");
    }

    @CrossOrigin
    @GetMapping("/")
    public Iterable<Usuario> findAllRecords() {
        return dbConnection.findAll();
    }
}
