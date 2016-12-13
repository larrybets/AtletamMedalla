package com.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.StreamSupport;

/**
 * Created by DAM on 30/11/16.
 */
@Entity
public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    @OneToMany(mappedBy = "atleta")
    @JsonIgnore
    private Set<Medalla> medallas = new HashSet<>();

 public Atleta(){

 }
    public Atleta(String nombre, String apellidos, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
       this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;

    }

    public Set<Medalla> getMedallas() {
        return medallas;
    }

    public void setMedallas(Set<Medalla> medallas) {
        this.medallas = medallas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", Nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
