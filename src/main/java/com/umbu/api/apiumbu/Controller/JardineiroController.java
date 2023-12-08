package com.umbu.api.apiumbu.Controller;

import com.umbu.api.apiumbu.Model.Jardineiro;
import com.umbu.api.apiumbu.Repository.JardineiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jardineiro")
public class JardineiroController {
    @Autowired
    JardineiroRepository dbConnection;
    @CrossOrigin
    @GetMapping("/")
    public List<Jardineiro>findAllRecords() {
        return dbConnection.findAll();
    }
}
