package com.example.jbarrientos.bilbapp;

/**
 * Created by jbarrientos on 4/01/17.
 */

public class Sitios {

    private String nombre;
    private int calificacion;

    public Sitios(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }

    public int getCalificacion() { return calificacion; }

}