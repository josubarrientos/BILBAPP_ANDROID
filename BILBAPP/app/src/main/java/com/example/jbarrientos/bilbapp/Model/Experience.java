package com.example.jbarrientos.bilbapp.Model;

import java.util.Date;

/**
 * Created by jbarrientos on 5/01/17.
 */

public class Experience {

    private String nombre;
    private Date fecha;
    private String opinion;

    public Experience(String nombre, Date fecha, String opinion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.opinion = opinion;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setFecha(int calificacion) { this.fecha = fecha; }
    public Date getFecha() { return fecha; }

    public void setOpinion(String opinion) { this.opinion = opinion; }
    public String getOpinion() { return opinion; }

}
