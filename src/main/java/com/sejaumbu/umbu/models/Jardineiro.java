package com.sejaumbu.umbu.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "jardineiro")
public class Jardineiro {
    @Id
    private Integer idjardineiro;
    @Column(name = "plano_idplano")
    private Integer planoIdPlano;
    @Column(name = "usuario_idusuario")
    private Integer usuarioIdUsuario;
    private String nome;

    public Integer getIdjardineiro() {
        return idjardineiro;
    }

    public void setIdjardineiro(Integer idjardineiro) {
        this.idjardineiro = idjardineiro;
    }

    public Integer getPlanoIdPlano() {
        return planoIdPlano;
    }

    public void setPlanoIdPlano(Integer planoIdPlano) {
        this.planoIdPlano = planoIdPlano;
    }

    public Integer getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Integer usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
