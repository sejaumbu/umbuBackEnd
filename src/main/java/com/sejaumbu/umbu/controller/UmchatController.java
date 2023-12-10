package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Jardineiro;
import com.sejaumbu.umbu.models.Umchat;
import com.sejaumbu.umbu.repository.UmchatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/umchat")
public class UmchatController {

    @Autowired
    UmchatRepository dbConnection;

    @PostMapping("/novochat")
    public Umchat novoUmchat(@RequestBody Umchat novoChat) {
        return dbConnection.save(novoChat);
    }

    @PutMapping("/alterarchat")
    public Umchat alterarUmchat(@RequestBody Umchat umchatAlterado) {
        return dbConnection.save(umchatAlterado);
    }

    @CrossOrigin
    @GetMapping("/")
    public List<Umchat> findAllRecords() {
        return dbConnection.findAll();
    }
}