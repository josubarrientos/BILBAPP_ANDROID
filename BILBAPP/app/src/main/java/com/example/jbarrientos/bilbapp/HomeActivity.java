package com.example.jbarrientos.bilbapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.content.DialogInterface;
import android.widget.Toast;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new AlertDialog.Builder(this).setTitle(R.string.instrucciones1).setMessage(R.string.texto_instrucciones1).setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                secondDialog();
            }
        }).show();

    }

    public void secondDialog() {

        AlertDialog.Builder alertadd = new AlertDialog.Builder(this).setTitle(R.string.instrucciones1);
        LayoutInflater factory = LayoutInflater.from(this);
        final View view = factory.inflate(R.layout.help_layout, null);
        alertadd.setView(view);
        alertadd.setNeutralButton("OK",null);
        alertadd.show();

    }

    public void selectFiesta(View v){

        Toast.makeText(getApplicationContext(), "Fiesta!", Toast.LENGTH_SHORT).show();

    }

    public void selectCompra(View v){

        Toast.makeText(getApplicationContext(), "Compras!", Toast.LENGTH_SHORT).show();

    }

    public void selectRestaurante(View v){

        Toast.makeText(getApplicationContext(), "Restaurantes!", Toast.LENGTH_SHORT).show();

    }

    public void selectHotel(View v){

        Toast.makeText(getApplicationContext(), "Hoteles!", Toast.LENGTH_SHORT).show();

    }

    public void selectDeporte(View v){

        Toast.makeText(getApplicationContext(), "Deportes!", Toast.LENGTH_SHORT).show();

    }

    public void selectMonumento(View v){

        Toast.makeText(getApplicationContext(), "Monumentos!", Toast.LENGTH_SHORT).show();

    }

    public void selectTransporte(View v){

        Toast.makeText(getApplicationContext(), "Transportes!", Toast.LENGTH_SHORT).show();

    }

}