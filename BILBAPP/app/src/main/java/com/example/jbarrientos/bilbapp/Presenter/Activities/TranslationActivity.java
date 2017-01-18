package com.example.jbarrientos.bilbapp.Presenter.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jbarrientos.bilbapp.Presenter.Adapters.TranslationAdapter;
import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Model.Translation;
import com.example.jbarrientos.bilbapp.R;

import java.util.ArrayList;

public class TranslationActivity extends AppCompatActivity {

    private ArrayList<Translation> versiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        setTitle(R.string.help_icon_3);

        String sitioType = getIntent().getStringExtra("extra_text");

        ListView lista = (ListView) findViewById(R.id.trans_list);

        DataPopulator recogedor = new DataPopulator();

        versiones=recogedor.cargaTranslations(this,sitioType);

        TranslationAdapter adaptador = new TranslationAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }
}
