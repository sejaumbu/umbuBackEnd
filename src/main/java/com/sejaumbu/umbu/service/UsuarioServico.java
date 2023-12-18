package com.sejaumbu.umbu.service;

import com.sejaumbu.umbu.controller.RespostaModelo;
import com.sejaumbu.umbu.models.Usuario;
import com.sejaumbu.umbu.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {
    @Autowired
    private UsuarioRepository ur;

    @Autowired
    private RespostaModelo rm;
    public Iterable<Usuario> listar() {
        return ur.findAll();
    }

    public ResponseEntity<?> cadastrarAlterar(Usuario um, String acao) {
        if(um.getEmail().equals("")){
            rm.setMensagem("O email do usuario é obrigatório");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getSenha().equals("")) {
            rm.setMensagem("A senha do usuário é obrigatória");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if(acao.equals("cadastrar")) {
                return new ResponseEntity<Usuario>(ur.save(um), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<Usuario>(ur.save(um), HttpStatus.OK);
            }
        }
    }
}
