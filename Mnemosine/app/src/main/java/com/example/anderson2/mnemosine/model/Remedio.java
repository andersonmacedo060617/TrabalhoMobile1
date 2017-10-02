package com.example.anderson2.mnemosine.model;

import java.io.Serializable;

/**
 * Created by Anderson2 on 01/10/2017.
 */

public class Remedio implements Serializable {
    private int id;
    private String nome;
    private String descricao;
    private String fabricante;
    private double pesoRemedio;

    public Remedio() {
    }

    public Remedio(int id, String nome, String descricao, String fabricante, double pesoRemedio) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.pesoRemedio = pesoRemedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPesoRemedio() {
        return pesoRemedio;
    }

    public void setPesoRemedio(double pesoRemedio) {
        this.pesoRemedio = pesoRemedio;
    }
}
