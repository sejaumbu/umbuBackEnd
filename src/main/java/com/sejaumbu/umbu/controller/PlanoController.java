package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Plano;
import com.sejaumbu.umbu.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/plano")
public class PlanoController {
    @Autowired
    PlanoRepository dbConnection;

    @PostMapping("/cadastrar")
    public Plano cadastrarNovoPlano(@RequestBody Plano novoPlano) {
        return dbConnection.save(novoPlano);
    }

    @PutMapping("/alterar")
    public Plano alterarPlano(@RequestBody Plano planoAlterado) {
        return dbConnection.save(planoAlterado);
    }

    @CrossOrigin
    @GetMapping("/")
    public List<Plano> findAllRecords() {
        return dbConnection.findAll();
    }
}