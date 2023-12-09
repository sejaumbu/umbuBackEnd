package com.sejaumbu.umbu.Model;

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
   Integer jardineiroIdJardineiro;
   String descricao;
   Date data;

    public Integer getIdtrabalho() {
        return idtrabalho;
    }

    public void setIdtrabalho(Integer idtrabalho) {
        this.idtrabalho = idtrabalho;
    }

    public Integer getJardineiroIdJardineiro() {
        return jardineiroIdJardineiro;
    }

    public void setJardineiroIdJardineiro(Integer jardineiroIdJardineiro) {
        this.jardineiroIdJardineiro = jardineiroIdJardineiro;
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
