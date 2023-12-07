package com.umbu.api.apiumbu.Controller;

import com.umbu.api.apiumbu.Model.Trabalho;
import com.umbu.api.apiumbu.Repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {
    @Autowired
    TrabalhoRepository dbConnection;
    @CrossOrigin
    @GetMapping("/")
    public List<Trabalho> findAllRecords() {
        return dbConnection.findAll();
    }
}
