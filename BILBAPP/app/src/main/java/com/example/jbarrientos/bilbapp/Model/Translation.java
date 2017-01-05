package com.example.jbarrientos.bilbapp.Model;

/**
 * Created by jbarrientos on 5/01/17.
 */

public class Translation {

    private String titulo;
    private String trans1;
    private String trans2;

    public Translation (String titulo, String trans1, String trans2){
        this.titulo=titulo;
        this.trans1=trans1;
        this.trans2=trans2;
    }


    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setTrans1(String trans1) { this.trans1 = trans1; }
    public void setTrans2(String trans2) { this.trans2 = trans2; }

    public String getTitulo() { return titulo; }
    public String getTrans1() { return trans1; }
    public String getTrans2() { return trans2; }



}
