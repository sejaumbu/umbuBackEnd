package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Trabalho;
import com.sejaumbu.umbu.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {
    @Autowired
    TrabalhoRepository dbConnection;

    @PostMapping("/cadastrar")
    public Trabalho cadastrarTrabalho(@RequestBody Trabalho novoTrabalho) {
        return dbConnection.save(novoTrabalho);
    }

    @PutMapping("/alterar")
    public Trabalho alterarTrabalho(@RequestBody Trabalho trabalhoAlterado) {
        return dbConnection.save(trabalhoAlterado);
    }
    @CrossOrigin
    @GetMapping("/")
    public List<Trabalho> findAllRecords() {
        return dbConnection.findAll();
    }
}
