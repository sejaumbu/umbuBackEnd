package com.umbu.api.apiumbu.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.*;
@Entity
@Table(schema = "jardineiro")
public class Jardineiro {
    @Id
    Integer idjardineiro;

    String nome;

    public Integer getIdjardineiro() {
        return idjardineiro;
    }

    public void setIdjardineiro(Integer idjardineiro) {
        this.idjardineiro = idjardineiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
