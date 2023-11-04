package com.example.applistalibros;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        ImageView ivPortada;
        CheckBox star;

        tvTitulo = (TextView) rowView.findViewById(R.id.tvTitulo);
        tvPaginas = (TextView)  rowView.findViewById(R.id.tvPaginas);
        ivPortada = (ImageView)  rowView.findViewById(R.id.ivPortada);

        star = (CheckBox)  rowView.findViewById(R.id.cbStar);

        tvTitulo.setText(libro.getTitulo());
        tvPaginas.setText(String.valueOf(libro.getPaginas()));

        int portada = libro.getPortada();

        ivPortada.setImageResource(libro.getPortada());

        star.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),libro.getTitulo(), Toast.LENGTH_LONG).show();
                }
            }
        });

        return rowView;

    };
}
