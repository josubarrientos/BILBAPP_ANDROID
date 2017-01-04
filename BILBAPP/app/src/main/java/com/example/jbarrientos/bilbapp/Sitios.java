package com.example.jbarrientos.bilbapp;

/**
 * Created by jbarrientos on 4/01/17.
 */

public class Sitios {

    private String nombre;
    private String calificacion;

    public Sitios(String nombre, String calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void setCalificacion(String calificacion) { this.calificacion = calificacion; }

    public String getCalificacion() { return calificacion; }

}