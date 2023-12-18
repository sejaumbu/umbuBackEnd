package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Parceiro;
import com.sejaumbu.umbu.repository.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/parceiro")
public class ParceiroController {
    @Autowired
    ParceiroRepository dbConnection;

    @PostMapping("/cadastrar")
    public Parceiro novoParceiro(@RequestBody Parceiro novoParceiro) {
        return dbConnection.save(novoParceiro);
    }

    @PutMapping("/alterar")
    public Parceiro alterarParceiro(@RequestBody Parceiro parceiroAlterado) {
        return dbConnection.save(parceiroAlterado);
    }
    @CrossOrigin
    @GetMapping("/")
    public List<Parceiro> findAllRecords(){
        return dbConnection.findAll();
    }
}
