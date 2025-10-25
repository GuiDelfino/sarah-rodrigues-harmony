package com.sarah_rodrigues.harmony.model;

import com.sarah_rodrigues.harmony.repository.Musicosrepository;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Formação")
public class Formacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private List<Musicos> musicosFormacao;
    private Double valorTotal;

    public Formacao(){}

    public Formacao(Long id, String nome, String descricao, List<Musicos> musicosFormacao, Double valorTotal) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.musicosFormacao = musicosFormacao;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Musicos> getMusicosFormacao() {
        return musicosFormacao;
    }

    public void setMusicosFormacao(List<Musicos> musicosFormacao) {
        this.musicosFormacao = musicosFormacao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
