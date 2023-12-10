package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Avaliacao;
import com.sejaumbu.umbu.models.Jardineiro;
import com.sejaumbu.umbu.repository.JardineiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.chrono.JapaneseDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/jardineiro")
public class JardineiroController {
    @Autowired
    JardineiroRepository dbConnection;

    @PostMapping("/cadastrar")
    public Jardineiro cadastrarJardineiro(@RequestBody Jardineiro novoJardineiro) {
        return dbConnection.save(novoJardineiro);
    }

    @PutMapping("/alterar")
    public Jardineiro alterarJardineiro(@RequestBody Jardineiro jardineiroAlterado) {
        return dbConnection.save(jardineiroAlterado);
    }

    @CrossOrigin
    @GetMapping("/")
    public List<Jardineiro>findAllRecords() {
        return dbConnection.findAll();
    }
}
