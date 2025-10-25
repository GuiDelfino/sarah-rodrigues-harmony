package com.sarah_rodrigues.harmony.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeNoivos;
    private String Local;
    private LocalDateTime data;
    private Formacao formacaoEscolhida;
    private Double valorTotal;

    public Evento() {}

    public Evento(Long id, String nomeNoivos, String local, LocalDateTime data, Formacao formacaoEscolhida, Double valorTotal) {
        this.id = id;
        this.nomeNoivos = nomeNoivos;
        Local = local;
        this.data = data;
        this.formacaoEscolhida = formacaoEscolhida;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeNoivos() {
        return nomeNoivos;
    }

    public void setNomeNoivos(String nomeNoivos) {
        this.nomeNoivos = nomeNoivos;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Formacao getFormacaoEscolhida() {
        return formacaoEscolhida;
    }

    public void setFormacaoEscolhida(Formacao formacaoEscolhida) {
        this.formacaoEscolhida = formacaoEscolhida;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
