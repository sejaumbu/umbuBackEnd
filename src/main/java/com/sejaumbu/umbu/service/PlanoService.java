package com.sejaumbu.umbu.service;

import com.sejaumbu.umbu.controller.RespostaModelo;
import com.sejaumbu.umbu.models.Plano;
import com.sejaumbu.umbu.models.Usuario;
import com.sejaumbu.umbu.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlanoService {
    @Autowired
    private PlanoRepository ur;

    @Autowired
    private RespostaModelo rm;
    public Iterable<Plano> listar() {
        return ur.findAll();
    }
    public ResponseEntity<?> cadastrarAlterar(Plano um, String acao) {
        if(um.getIdplano().equals("")){
            rm.setMensagem("O Id do plano é obrigatório");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getTipo().equals("")) {
            rm.setMensagem("O tipo do plano é obrigatória");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if(acao.equals("cadastrar")) {
                return new ResponseEntity<Plano>(ur.save(um), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<Plano>(ur.save(um), HttpStatus.OK);
            }
        }
    }
}
