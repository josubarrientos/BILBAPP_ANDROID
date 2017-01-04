package com.example.jbarrientos.bilbapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.content.DialogInterface;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new AlertDialog.Builder(this).setTitle(R.string.instrucciones1).setMessage(R.string.texto_instrucciones1).setNeutralButton(R.string.accept_bottom, new DialogInterface.OnClickListener() {
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
        alertadd.setNeutralButton(R.string.accept_bottom, null);
        alertadd.show();

    }

}