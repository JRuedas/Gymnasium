package com.upm.ipo.gymnasium;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proximamente(View view) {
        Intent i = new Intent(this, proximamente.class );
        startActivity(i);
    }

    public void selecPlanif(View view) {
        Intent i = new Intent(this, seleccion_planificacion.class );
        startActivity(i);
    }
}
