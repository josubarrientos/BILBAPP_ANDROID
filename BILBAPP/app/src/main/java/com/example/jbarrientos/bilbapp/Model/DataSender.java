package com.example.jbarrientos.bilbapp.Model;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.R;


/**
 * Created by jbarrientos on 5/01/17.
 */

public class DataSender {

    private RestClient restClient;
    private String server = "http://u017633.ehu.eus:28080/BILBAPP_SERVER/rest/Bilbapp/";

    public DataSender(){

    }

    public Boolean sendExperiencia(Context ctx,String nombreSitio){

        Boolean sended = true;

        AlertDialog.Builder loginDialog = new AlertDialog.Builder(ctx);

        LayoutInflater factory = LayoutInflater.from(ctx);
        final View f = factory.inflate(R.layout.experience_insert, null);

        loginDialog.setTitle(ctx.getString(R.string.qualification_title)+" "+nombreSitio);
        loginDialog.setView(f);

        Button submit = (Button)f.findViewById(R.id.submit);

        final AlertDialog dialog = loginDialog.create();

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText name = (EditText)f.findViewById(R.id.user_name);
                EditText opinion = (EditText)f.findViewById(R.id.user_opinion);

                String user_name = name.getText().toString();
                String user_opinion = opinion.getText().toString();

                dialog.dismiss();

            };

        });

        dialog.show();

        return sended;

    }

    public Boolean sendQualification(Context ctx,String nombre,float nota){

        Boolean sended = true;

        Toast toast1 =
                Toast.makeText(ctx,
                        nombre+" : "+nota, Toast.LENGTH_SHORT);

        toast1.show();

        return sended;

    }

}