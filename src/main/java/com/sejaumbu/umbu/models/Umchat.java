package com.sejaumbu.umbu.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.*;
@Entity
@Table(schema = "umchat")
public class Umchat {

    @Id
    Integer idumchat;
    String mensagem;
    Date datahora;

    public Integer getIdumchat() {
        return idumchat;
    }

    public void setIdumchat(Integer idumchat) {
        this.idumchat = idumchat;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

}