package com.umbu.api.apiumbu.Controller;

import com.umbu.api.apiumbu.Model.Parceiro;
import com.umbu.api.apiumbu.Repository.ParceiroRepository;
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
