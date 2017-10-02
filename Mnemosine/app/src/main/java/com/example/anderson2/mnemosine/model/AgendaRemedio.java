package com.example.anderson2.mnemosine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anderson2 on 01/10/2017.
 */

public class AgendaRemedio implements Serializable {
    private int id;
    private Date dataInicio;
    private Date dataFim;

    //A cada x dias precisa tomar
    private int frequenciaDeDias;

    private double dosagem;
    private String tipoDosagem;
    private List<HorarioDoseRemedio> horariosRemedio;

    public AgendaRemedio() {
        this.horariosRemedio = new ArrayList<>();
    }

    public AgendaRemedio(Date dataInicio, Date dataFim, int frequenciaDeDias, double dosagem, String tipoDosagem) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.frequenciaDeDias = frequenciaDeDias;
        this.dosagem = dosagem;
        this.tipoDosagem = tipoDosagem;
        this.horariosRemedio = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getFrequenciaDeDias() {
        return frequenciaDeDias;
    }

    public void setFrequenciaDeDias(int frequenciaDeDias) {
        this.frequenciaDeDias = frequenciaDeDias;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public String getTipoDosagem() {
        return tipoDosagem;
    }

    public void setTipoDosagem(String tipoDosagem) {
        this.tipoDosagem = tipoDosagem;
    }

    public List<HorarioDoseRemedio> getHorariosRemedio() {
        return horariosRemedio;
    }

    public void setHorariosRemedio(List<HorarioDoseRemedio> horariosRemedio) {
        this.horariosRemedio = horariosRemedio;
    }
}
