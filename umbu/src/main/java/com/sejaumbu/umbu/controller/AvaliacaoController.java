package com.sejaumbu.umbu.controller;


import com.sejaumbu.umbu.models.Avaliacao;
import com.sejaumbu.umbu.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//esse request é um end point
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoRepository repository;

    @GetMapping
    public List<Avaliacao> getAll(){
        List<Avaliacao> avaliacaoList = repository.findAll();
        return avaliacaoList;

    }
}
