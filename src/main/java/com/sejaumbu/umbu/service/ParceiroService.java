package com.sejaumbu.umbu.service;

import com.sejaumbu.umbu.controller.RespostaModelo;
import com.sejaumbu.umbu.models.Parceiro;
import com.sejaumbu.umbu.repository.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ParceiroService {
    @Autowired
    private ParceiroRepository ur;

    @Autowired
    private RespostaModelo rm;
    public Iterable<Parceiro> listar() {
        return ur.findAll();
    }

    public ResponseEntity<?> cadastrarAlterar(Parceiro um, String acao) {
        if(um.getIdparceiro().equals("")){
            rm.setMensagem("O Id do parceiro é obrigatório");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getUrlVitrine().equals("")) {
            rm.setMensagem("A URL do parceiro é obrigatória");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if(acao.equals("cadastrar")) {
                return new ResponseEntity<Parceiro>(ur.save(um), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<Parceiro>(ur.save(um), HttpStatus.OK);
            }
        }
    }
}
