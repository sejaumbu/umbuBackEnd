package com.sejaumbu.umbu.Controller;

import com.sejaumbu.umbu.Model.Usuario;
import com.sejaumbu.umbu.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Usuario>findAllRecords() {
        return dbConnection.findAll();
    }
}
