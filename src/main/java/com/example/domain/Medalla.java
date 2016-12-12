package com.example.domain;

import javax.persistence.*;

/**
 * Created by DAM on 30/11/16.
 */
@Entity
public class Medalla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Enumeracion enumeracion;
    private String especialidad;
    private String competicion;

@ManyToOne

private Atleta atleta;

    public Medalla() {

    }


    public Medalla(Enumeracion enumeracion, String especialidad, String competicion) {
        this.enumeracion = enumeracion;
        this.especialidad = especialidad;
        this.competicion = competicion;
    }

    public Medalla(Enumeracion enumeracion, String especialidad, String competicion, Atleta atleta) {
        this.enumeracion = enumeracion;
        this.especialidad = especialidad;
        this.competicion = competicion;
        this.atleta = atleta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enumeracion getEnumeracion() {
        return this.enumeracion;
    }

    public void setEnumeracion(Enumeracion enumeracion) {
        this.enumeracion = enumeracion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
}
