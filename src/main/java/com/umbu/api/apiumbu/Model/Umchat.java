package com.umbu.api.apiumbu.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(schema = "umchat")
public class Umchat {
    @Id
    Integer idumchat;
    String menssagem;
    Date datahora;

    public Integer getIdumchat() {
        return idumchat;
    }

    public void setIdumchat(Integer idumchat) {
        this.idumchat = idumchat;
    }

    public String getMenssagem() {
        return menssagem;
    }

    public void setMenssagem(String menssagem) {
        this.menssagem = menssagem;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }
}
