package com.umbu.api.apiumbu.Controller;

import com.umbu.api.apiumbu.Model.Usuario;
import com.umbu.api.apiumbu.Repository.UsuarioRepository;
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
