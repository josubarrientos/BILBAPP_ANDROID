package com.example.jbarrientos.bilbapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //setTitle(R.string.help_icon_1);

        ListView lista = (ListView) findViewById(R.id.info_list);

        ArrayList<Sitios> versiones =
                new ArrayList<Sitios>();

        versiones.add(
                new Sitios("Lucid Lynx", "Lucid Lynx"));

        versiones.add(
                new Sitios("Lucid Lynx", "Lucid Lynx"));

        versiones.add(
                new Sitios("Lucid Lynx", "Lucid Lynx"));

        versiones.add(
                new Sitios("Lucid Lynx", "Lucid Lynx"));

        StaticSitiosAdapter adaptador = new StaticSitiosAdapter(this, versiones);
        //setListAdapter(adaptador);
        lista.setAdapter(adaptador);
/*
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.info_list);


        // Defined Array values to show in ListView
        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);
*/
    }

}
