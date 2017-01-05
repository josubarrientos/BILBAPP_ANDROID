package com.example.jbarrientos.bilbapp.Model;

/**
 * Created by jbarrientos on 4/01/17.
 */

public class Sitios {

    private String nombre;
    private int calificacion;
    private String direccion;

    public Sitios(String nombre, int calificacion, String direccion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }
    public int getCalificacion() { return calificacion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getDireccion() { return direccion; }

}