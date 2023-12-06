package com.sejaumbu.umbu.models;


import com.sejaumbu.umbu.repository.AvaliacaoRepository;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity //Mostra ao SPRING que é uma tabela
@Table(schema = "avaliacao")
public class Avaliacao {



    @Id
    Integer idavaliacao;

    @Column(name = "jardineiro_idjardineiro")
    Integer jardineiroIdJardineiro;

    String comentario;

    Float nota;

    @Column(name = "data_2")
    Date data2;

    public Integer getIdavaliacao() {
        return idavaliacao;
    }

    public void setIdavaliacao(Integer idavaliacao) {
        this.idavaliacao = idavaliacao;
    }

    public Integer getJardineiroIdJardineiro() {
        return jardineiroIdJardineiro;
    }

    public void setJardineiroIdJardineiro(Integer jardineiroIdJardineiro) {
        this.jardineiroIdJardineiro = jardineiroIdJardineiro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }
}