package com.example.applistadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MiArrayAdapterLibros extends BaseAdapter {

    Context context;
    ArrayList<Datos> libros;
    LayoutInflater inflater;

    public MiArrayAdapterLibros(Context c, ArrayList<Datos> l) {
        this.context = c;
        this.libros = l;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount(){
        return libros.size();
    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = inflater.inflate(R.layout.libro_item_list,null);

        Datos libro = (Datos) getItem(position);

        TextView tvTitulo,tvPaginas;

        tvTitulo = convertView.findViewById(R.id.tvTitulo);
        tvPaginas = convertView.findViewById(R.id.tvPaginas);

        tvTitulo.setText(libro.getTitulo());
        tvPaginas.setText(libro.getPaginas());

        return convertView;

    }
}
