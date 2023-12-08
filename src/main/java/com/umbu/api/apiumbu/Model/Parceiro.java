package com.umbu.api.apiumbu.Model;

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
    String url_vitrine;

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

    public String getUrl_vitrine() {
        return url_vitrine;
    }

    public void setUrl_vitrine(String url_vitrine) {
        this.url_vitrine = url_vitrine;
    }
}
