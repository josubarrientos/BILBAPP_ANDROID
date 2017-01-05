package com.example.jbarrientos.bilbapp.Model;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.example.jbarrientos.bilbapp.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by jbarrientos on 5/01/17.
 */

public class DataSender {

    public DataSender(){

    }

    public Boolean sendExperiencia(Context ctx,String experiencia){

        Boolean sended = true;

        AlertDialog.Builder loginDialog = new AlertDialog.Builder(ctx);

        LayoutInflater factory = LayoutInflater.from(ctx);
        final View f = factory.inflate(R.layout.experience_insert, null);

        loginDialog.setTitle("Please enter your name and email");
        loginDialog.setView(f);


        //loginDialog.show();

        Button submit = (Button)f.findViewById(R.id.submit);

        final AlertDialog dialog = loginDialog.create();

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText full_name = (EditText)f.findViewById(R.id.follower_name);
                EditText email_address = (EditText)f.findViewById(R.id.follower_email);

                String follower_name = full_name.getText().toString();
                String follower_email = email_address.getText().toString();

                dialog.dismiss();

            };

        });

        dialog.show();

        return sended;

    }
}