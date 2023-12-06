package com.sejaumbu.umbu.controller;


import com.sejaumbu.umbu.models.Avaliacao;
import com.sejaumbu.umbu.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    AvaliacaoRepository dbConector;

    @CrossOrigin //Para evitar o erro de CORS
    @GetMapping("/")
    public List<Avaliacao> findAllRecords(){
        return dbConector.findAll();
    }

}
