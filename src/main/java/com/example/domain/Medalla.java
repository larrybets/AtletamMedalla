package com.example.domain;

import com.example.domain.Atleta;

import javax.persistence.ManyToOne;

/**
 * Created by DAM on 30/11/16.
 */
public class Medalla {

    private long id;
    private enum Enumeracion {Oro,Plata,Bronce}
    private String Especialidad;
    private String Competicion;
@ManyToOne
private Atleta atleta;
    public Medalla() {

    }

    public Medalla(long id, String especialidad, String competicion) {

        this.id = id;
        Especialidad = especialidad;
        Competicion = competicion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getCompeticion() {
        return Competicion;
    }

    public void setCompeticion(String competicion) {
        Competicion = competicion;
    }
}
