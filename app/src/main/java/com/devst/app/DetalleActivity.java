package com.devst.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

//Clase evento explicito abrir detalle
public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


        String titulo = getIntent().getStringExtra("titulo");
        if (titulo == null) titulo = "Sin título";

        String descripcion = getIntent().getStringExtra("descripcion");
        if (descripcion == null) descripcion = "Sin descripción";

        TextView tvTitulo = findViewById(R.id.tvTitulo);
        TextView tvDescripcion = findViewById(R.id.tvDescripcion);

        tvTitulo.setText(titulo);
        tvDescripcion.setText(descripcion);
    }
}
