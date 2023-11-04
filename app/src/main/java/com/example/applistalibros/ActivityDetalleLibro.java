package com.example.applistalibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetalleLibro extends AppCompatActivity {

    private Bundle bundleLibro;
    ImageView imageView;
    TextView tvTituloDetalle, tvNumPaginasDetalle,tvDescripcionDetalle;
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_libro);

        tvTituloDetalle = (TextView) findViewById(R.id.tvTituloDetalle);
        tvNumPaginasDetalle = (TextView) findViewById(R.id.tvNumPaginasDetalle);
        imageView = (ImageView) findViewById(R.id.imageView);
        tvDescripcionDetalle = (TextView) findViewById(R.id.tvDescripcionDetalle);

        btnVolver = (Button) findViewById(R.id.btnVolver);



        bundleLibro = getIntent().getExtras();

        Datos libroExtra = (Datos) bundleLibro.getSerializable("extra_libro");

        String titulo = libroExtra.getTitulo();
        int paginas = libroExtra.getPaginas();
        int portada = libroExtra.getPortada();
        String descripcion = libroExtra.getDescripcion();

        tvTituloDetalle.setText(titulo);
        tvNumPaginasDetalle.setText("Num. páginas: "+String.valueOf(paginas));
        imageView.setImageResource(portada);
        tvDescripcionDetalle.setText(descripcion);



        btnVolver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent i = new Intent(v.getContext(),MainActivity.class);
                startActivity(i);
            }
        });


    }
}