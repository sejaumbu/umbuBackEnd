package com.umbu.api.apiumbu.Controller;

import com.umbu.api.apiumbu.Model.Plano;
import com.umbu.api.apiumbu.Repository.PlanoRepository;
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