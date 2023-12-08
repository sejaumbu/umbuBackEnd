package com.sejaumbu.umbu.controller;
import com.sejaumbu.umbu.models.Umchat;
import com.sejaumbu.umbu.repository.UmchatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/umchat")
public class UmchatController {

    @Autowired
    UmchatRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Umchat> findAllRecords() {
        return dbConnection.findAll();
    }
}