package com.sejaumbu.umbu.controller;

import com.sejaumbu.umbu.models.Plano;
import com.sejaumbu.umbu.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
@RequestMapping("/plano")
public class PlanoController {
    @Autowired
    PlanoRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Plano> findAllRecords() {
        return dbConnection.findAll();
    }
}