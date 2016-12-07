package com.example.domain;

import com.example.domain.Atleta;

import javax.persistence.*;

/**
 * Created by DAM on 30/11/16.
 */
@Entity
public class Medalla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Enumeracion Enumeracion;
    private String Especialidad;
    private String Competicion;

@ManyToOne
private Atleta atleta;
    public Medalla() {

    }


    public Medalla(com.example.domain.Enumeracion enumeracion, String especialidad, String competicion) {
        Enumeracion = enumeracion;
        Especialidad = especialidad;
        Competicion = competicion;
    }

    public Medalla(com.example.domain.Enumeracion enumeracion, String especialidad, String competicion, Atleta atleta) {
        Enumeracion = enumeracion;
        Especialidad = especialidad;
        Competicion = competicion;
        this.atleta = atleta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public com.example.domain.Enumeracion getEnumeracion() {
        return Enumeracion;
    }

    public void setEnumeracion(com.example.domain.Enumeracion enumeracion) {
        Enumeracion = enumeracion;
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

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
}
