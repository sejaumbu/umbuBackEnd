package com.sejaumbu.umbu.models;

import jakarta.persistence.*;

@Table(name = "avaliacao")
@Entity(name = "avaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idavaliacao;

    private String comentario;

    private float nota;

    private Integer data_2;

    public Integer getIdavaliacao() {
        return idavaliacao;
    }

    public void setIdavaliacao(int idavaliacao) {
        this.idavaliacao = idavaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getData_2() {
        return data_2;
    }

    public void setData_2(int data_2) {
        this.data_2 = data_2;
    }
}
