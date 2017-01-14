package com.example.jbarrientos.bilbapp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jbarrientos.bilbapp.Adapters.StaticSitiosAdapter;
import com.example.jbarrientos.bilbapp.Model.MyAsyncTaskSitios;
import com.example.jbarrientos.bilbapp.Model.Sitios;
import com.example.jbarrientos.bilbapp.R;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setTitle(R.string.help_icon_1);

        String sitioType = getIntent().getStringExtra("extra_text");

        lista = (ListView) findViewById(R.id.info_list);

        MyAsyncTaskSitios runner = new MyAsyncTaskSitios(InfoActivity.this);
        runner.execute(sitioType);

    }


    public void populateList(ArrayList<Sitios> sitios) {
        StaticSitiosAdapter adaptador = new StaticSitiosAdapter(this, sitios);
        lista.setAdapter(adaptador);
    }


}
