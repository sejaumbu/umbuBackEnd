package com.umbu.api.apiumbu.Controller;
import com.umbu.api.apiumbu.Model.Umchat;
import com.umbu.api.apiumbu.Repository.UmchatRepository;
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