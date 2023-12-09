package com.sejaumbu.umbu.Controller;

import com.sejaumbu.umbu.Model.Parceiro;
import com.sejaumbu.umbu.Repository.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/parceiro")
public class ParceiroController {
    @Autowired
    ParceiroRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Parceiro> findAllRecords(){
        return dbConnection.findAll();
    }
}
