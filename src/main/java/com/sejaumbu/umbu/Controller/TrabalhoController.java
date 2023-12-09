package com.sejaumbu.umbu.Controller;

import com.sejaumbu.umbu.Model.Trabalho;
import com.sejaumbu.umbu.Repository.TrabalhoRepository;
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
