package com.sejaumbu.umbu.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "parceiro")
public class Parceiro {
    @Id
    Integer idparceiro;
    String descricao;
    @Column(name = "url_vitrine")
    String urlVitrine;

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
