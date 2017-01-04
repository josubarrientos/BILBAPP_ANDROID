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

        Intent i = new Intent(HomeActivity.this, SelectionActivity.class);
        i.putExtra("extra_text", "fiesta");
        startActivity(i);
    }

    public void selectCompra(View v){

        Toast.makeText(getApplicationContext(), "Compras!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(HomeActivity.this, SelectionActivity.class);
        i.putExtra("extra_text", "compras");
        startActivity(i);
    }

    public void selectRestaurante(View v){

        Toast.makeText(getApplicationContext(), "Restaurantes!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(HomeActivity.this, SelectionActivity.class);
        i.putExtra("extra_text", "restaurantes");
        startActivity(i);
    }

    public void selectHotel(View v){

        Toast.makeText(getApplicationContext(), "Hoteles!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(HomeActivity.this, SelectionActivity.class);
        i.putExtra("extra_text", "hotel");
        startActivity(i);
    }

    public void selectDeporte(View v){

        Toast.makeText(getApplicationContext(), "Deportes!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(HomeActivity.this, SelectionActivity.class);
        i.putExtra("extra_text", "deporte");
        startActivity(i);
    }

    public void selectMonumento(View v){

        Toast.makeText(getApplicationContext(), "Monumentos!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(HomeActivity.this, SelectionActivity.class);
        i.putExtra("extra_text", "monumentos");
        startActivity(i);
    }

    public void selectTransporte(View v){

        Toast.makeText(getApplicationContext(), "Transportes!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(HomeActivity.this, SelectionActivity.class);
        i.putExtra("extra_text", "transporte");
        startActivity(i);
    }

}