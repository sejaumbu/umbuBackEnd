package com.sejaumbu.umbu.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "parceiro")
public class Parceiro {
    @Id
    private Integer idparceiro;
    public String descricao;
    @Column(name = "url_vitrine")
    public String urlVitrine;

    public Integer getIdparceiro() {
        return idparceiro;
    }

    public void setIdparceiro(Integer idparceiro) {
        this.idparceiro = idparceiro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrlVitrine() {
        return urlVitrine;
    }

    public void setUrlVitrine(String urlVitrine) {
        this.urlVitrine = urlVitrine;
    }
}
