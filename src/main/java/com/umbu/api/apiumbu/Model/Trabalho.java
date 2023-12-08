package com.umbu.api.apiumbu.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(schema = "trabalho")
public class Trabalho {
    @Id
    Integer idtrabalho;
    String descricao;
    Date data;

    public Integer getIdtrabalho() {
        return idtrabalho;
    }

    public void setIdtrabalho(Integer idtrabalho) {
        this.idtrabalho = idtrabalho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
