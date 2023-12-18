package com.sejaumbu.umbu.service;

import com.sejaumbu.umbu.controller.RespostaModelo;
import com.sejaumbu.umbu.models.Jardineiro;
import com.sejaumbu.umbu.repository.JardineiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class JardineiroService {
    @Autowired
    private JardineiroRepository ur;

    @Autowired
    private RespostaModelo rm;
    public Iterable<Jardineiro> listar() {
        return ur.findAll();
    }

    public ResponseEntity<?> cadastrarAlterar(Jardineiro um, String acao) {
        if(um.getIdjardineiro().equals("")){
            rm.setMensagem("O Id do Jardineiro é obrigatório");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getPlanoIdPlano().equals("")) {
            rm.setMensagem("O plano do Jardineiro é obrigatória");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if(acao.equals("cadastrar")) {
                return new ResponseEntity<Jardineiro>(ur.save(um), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<Jardineiro>(ur.save(um), HttpStatus.OK);
            }
        }
    }
}
