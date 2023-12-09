package com.sejaumbu.umbu.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(schema = "plano")
public class Plano {
    @Id
    Integer idplano;
    String tipo;
    Float preco;

    public Integer getIdplano() {
        return idplano;
    }

    public void setIdplano(Integer idplano) {
        this.idplano = idplano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}