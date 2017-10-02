package com.example.anderson2.mnemosine.model;

import java.io.Serializable;

/**
 * Created by Anderson2 on 01/10/2017.
 */

public class HorarioDoseRemedio implements Serializable {
    private int id;
    private int hora, minuto;

    public HorarioDoseRemedio() {
    }

    public HorarioDoseRemedio(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
