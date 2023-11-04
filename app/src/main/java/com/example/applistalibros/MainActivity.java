package com.example.applistalibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        libros.add(new Datos("Acceso a datos",424, R.drawable.acceso_datos,"Este libro tiene una orientación práctica; se exponen los contenidos teóricos seguidos de ejemplos y actividades diseñadas para facilitar la comprensión de los mismos. En el primer capítulo se trata el manejo de ficheros (de bytes, de texto, aleatorios y XML) utilizando el lenguaje JAVA, y además el uso de JAXB, tecnología Java que permite mapear clases Java a representaciones XML, y viceversa."));
        libros.add(new Datos("Lenguajes de marcas y sistemas de gestión de la información",416,R.drawable.lenguaje_marcas, "Este texto tiene una orientación fundamentalmente práctica; para ello, el enfoque ha sido intercalar un buen número de ejemplos resueltos y actividades cortas entre los contenidos teóricos, para asimilar las ideas y dinamizar el desarrollo de las clases. Al final de cada capítulo hay ejercicios propuestos de mayor duración" ));
        libros.add(new Datos("Sistemas informáticos y redes locales",226, R.drawable.sistemas_informaticos, "El capítulo 1 es un capítulo introductorio para que el lector pueda conocer cómo usar suites ofimáticas como Microsoft Office o LibreOffice, y trucos para realizar búsquedas en Internet y uso de correo electrónico"));
        libros.add(new Datos("Entornos de desarrollo",378, R.drawable.entornos,"El contenido de este libro tiene una orientación práctica. En el Capítulo 1 se estudian los procesos, actividades y tareas involucradas en el desarrollo, explotación y mantenimiento de un producto de software. Se estudia la relación entre un programa informático y los distintos componentes del ordenador, se analizan diferentes lenguajes de programación, se estudian los diferentes estados por los que pasa un programa desde que se escribe hasta que se ejecuta en el ordenador, se introduce el concepto de máquina virtual."));
        libros.add(new Datos("Administración de sistemas gestores de bases de datos",314, R.drawable.administracion_bases, "Este texto incluye, como parte de la automatización de tareas (scripts), los backups y restores de bases de datos. Además, se ha explicado extensamente el Recovery Manager (rman) de Oracle, que se considera fundamental en la formación de cualquier DBA. En cualquier caso, el objetivo se mantiene: la formación de administradores de bases de datos actualizados, versátiles y competentes."));

        lvLibros =  findViewById(R.id.lvLibros);
        adaptadorLibro = new MiArrayAdapterLibros(this,libros);
        lvLibros.setAdapter(adaptadorLibro);

        lvLibros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos libro = adaptadorLibro.getItem(position);

                Toast.makeText(view.getContext(), "Libro consultado: "+libro.getTitulo(),Toast.LENGTH_SHORT).show();

                Intent i = new Intent(view.getContext(), ActivityDetalleLibro.class);

                //i.putExtra("extra_titulo",libro.getTitulo());
                //i.putExtra("extra_paginas",libro.getPaginas());
                //i.putExtra("extra_portada",libro.getPortada());

                i.putExtra("extra_libro",libro);

                startActivity(i);

            }
        });


    }
}