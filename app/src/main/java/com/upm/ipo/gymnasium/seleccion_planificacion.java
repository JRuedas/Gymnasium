package com.upm.ipo.gymnasium;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class seleccion_planificacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_planificacion);
    }

    public void nueva(View view) {
        Intent i = new Intent(this, seleccion_datos_planificacion.class );
        startActivity(i);
    }

    public void modificar(View view) {
        Intent i = new Intent(this, seleccion_datos_planificacion.class );
        startActivity(i);
    }

    public void rutinas(View view) {
        Intent i = new Intent(this, proximamente.class );
        startActivity(i);
    }

    public void importar(View view) {
        Intent i = new Intent(this, proximamente.class );
        startActivity(i);
    }
}
