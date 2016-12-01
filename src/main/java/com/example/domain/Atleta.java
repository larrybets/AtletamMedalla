package com.example.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by DAM on 30/11/16.
 */
public class Atleta {
    @Id
    @GeneratedValue
    private long id;
    private String Nombre;
    private String Apellidos;

    private String Nacionalidad;
    private LocalDate FechaNacimiento;


    public Atleta(String nombre, String apellidos, String nacionalidad, LocalDate fechaNacimiento) {
        Nombre = nombre;
        Apellidos = apellidos;
        Nacionalidad = nacionalidad;
        FechaNacimiento = fechaNacimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
