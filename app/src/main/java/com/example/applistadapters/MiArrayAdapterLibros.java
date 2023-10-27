package com.example.applistadapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MiArrayAdapterLibros extends ArrayAdapter<Datos> {

    private final Activity context;
    ArrayList<Datos> libros;

    public MiArrayAdapterLibros(Activity c, ArrayList<Datos> l) {
        super(c, R.layout.libro_item_list, l);
        this.context = c;
        this.libros = l;
    }

    @NonNull
    public View getView(int position,View view,@NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.libro_item_list, parent,false);

        Datos libro = libros.get(position);

        TextView tvTitulo,tvPaginas;

        tvTitulo = (TextView) rowView.findViewById(R.id.tvTitulo);
        tvPaginas = (TextView)  rowView.findViewById(R.id.tvPaginas);

        tvTitulo.setText(libro.getTitulo());
        tvPaginas.setText(String.valueOf(libro.getPaginas()));

        return rowView;

    };
}
