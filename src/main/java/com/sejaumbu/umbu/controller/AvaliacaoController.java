package com.sejaumbu.umbu.controller;


import com.sejaumbu.umbu.models.Avaliacao;
import com.sejaumbu.umbu.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    AvaliacaoRepository dbConector;

    @PostMapping("/avaliar")
    public Avaliacao informarAvaliacao(@RequestBody Avaliacao novaAvaliacao) {
        return dbConector.save(novaAvaliacao);
    }

    @PutMapping("/alterar")
    public Avaliacao alterarAvaliacao(@RequestBody Avaliacao avaliacaoAlterada) {
        return dbConector.save(avaliacaoAlterada);
    }

    @CrossOrigin //Para evitar o erro de CORS
    @GetMapping("/")
    public List<Avaliacao> findAllRecords(){
        return dbConector.findAll();
    }

}
