package com.example.anderson2.mnemosine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anderson2 on 01/10/2017.
 */

public class Receita implements Serializable {
    private int id;
    private String descricao;
    private String nomeMedico;
    private Date dataConsulta;
    private boolean compartilhada;
    private ArrayList<AgendaRemedio> agendaRemedios;

    public Receita() {
        this.agendaRemedios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public boolean isCompartilhada() {
        return compartilhada;
    }

    public void setCompartilhada(boolean compartilhada) {
        this.compartilhada = compartilhada;
    }

    public ArrayList<AgendaRemedio> getAgendaRemedios() {
        return agendaRemedios;
    }

    public void setAgendaRemedios(ArrayList<AgendaRemedio> agendaRemedios) {
        this.agendaRemedios = agendaRemedios;
    }
}
