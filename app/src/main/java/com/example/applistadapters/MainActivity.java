package com.example.applistadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvLibros;
    private MiArrayAdapterLibros adaptadorLibro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Datos> libros = new ArrayList<>();
        libros.add(new Datos("Acceso a datos",424));
        libros.add(new Datos("Lenguajes de marcas y sistemas de gestión de la información",416));
        libros.add(new Datos("Sistemas informáticos y redes locales",226));
        libros.add(new Datos("Entornos de desarrollo",378));
        libros.add(new Datos("Administración de sistemas gestores de bases de datos",314));

        lvLibros =  findViewById(R.id.lvLibros);
        adaptadorLibro = new MiArrayAdapterLibros(this,libros);
        lvLibros.setAdapter(adaptadorLibro);

        lvLibros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos libro = adaptadorLibro.getItem(position);

                Toast.makeText(view.getContext(), "Libro consultado: "+libro.getTitulo(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}