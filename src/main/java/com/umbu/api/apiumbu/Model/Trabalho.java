package com.umbu.api.apiumbu.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(schema = "trabalho")
public class Trabalho {
   @Id
   Integer idtrabalho;
   @Column(name = "jardineiro_idjardineiro")
   Integer jardineiro_idjardineiro;
   String descricao;
   Date data;

    public Integer getIdtrabalho() {
        return idtrabalho;
    }

    public void setIdtrabalho(Integer idtrabalho) {
        this.idtrabalho = idtrabalho;
    }

    public Integer getJardineiro_idjardineiro() {
        return jardineiro_idjardineiro;
    }

    public void setJardineiro_idjardineiro(Integer jardineiro_idjardineiro) {
        this.jardineiro_idjardineiro = jardineiro_idjardineiro;
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
