package com.sejaumbu.umbu.Controller;

import com.sejaumbu.umbu.Model.Jardineiro;
import com.sejaumbu.umbu.Repository.JardineiroRepository;
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
