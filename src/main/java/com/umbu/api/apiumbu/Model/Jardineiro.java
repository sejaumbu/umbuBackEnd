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
    Integer plano_idplano;
    Integer usuario_idusuario;
    String nome;

    public Integer getIdjardineiro() {
        return idjardineiro;
    }

    public void setIdjardineiro(Integer idjardineiro) {
        this.idjardineiro = idjardineiro;
    }

    public Integer getPlano_idplano() {
        return plano_idplano;
    }

    public void setPlano_idplano(Integer plano_idplano) {
        this.plano_idplano = plano_idplano;
    }

    public Integer getUsuario_idusuario() {
        return usuario_idusuario;
    }

    public void setUsuario_idusuario(Integer usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
