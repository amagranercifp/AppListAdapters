package com.example.applistadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvLibros;
    private MiArrayAdapterLibros adaptadorLibro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Datos> libros = new ArrayList<>();
        libros.add(new Datos("Título 1",122));
        libros.add(new Datos("Título 2",222));
        libros.add(new Datos("Título 3",322));
        libros.add(new Datos("Título 4",422));
        libros.add(new Datos("Título 5",522));

        lvLibros = (ListView) findViewById(R.id.lvLibros);

        adaptadorLibro = new MiArrayAdapterLibros(this,libros);

        lvLibros.setAdapter(adaptadorLibro);
    }
}