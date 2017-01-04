package com.example.jbarrientos.bilbapp;

/**
 * Created by jbarrientos on 4/01/17.
 */

public class sitios {
    private String nombre;
    private int calificacion;

    public sitios(String nombre, int calificacion){
        super();
        this.nombre=nombre;
        this.calificacion=calificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCalificacion(){
        return calificacion;
    }

}
