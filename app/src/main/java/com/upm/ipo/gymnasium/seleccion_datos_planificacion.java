package com.upm.ipo.gymnasium;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class seleccion_datos_planificacion extends AppCompatActivity {

    private TextView tvNumDias;
    private CheckBox checkLunes, checkMartes, checkMiercoles, checkJueves, checkViernes, checkSabado, checkDomingo;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_datos_planificacion);

        tvNumDias = (TextView) findViewById(R.id.tvNumDias);
        checkLunes = (CheckBox) findViewById(R.id.checkBoxLunes);
        checkMartes = (CheckBox) findViewById(R.id.checkBoxMartes);
        checkMiercoles = (CheckBox) findViewById(R.id.checkBoxMiercoles);
        checkJueves = (CheckBox) findViewById(R.id.checkBoxJueves);
        checkViernes = (CheckBox) findViewById(R.id.checkBoxViernes);
        checkSabado = (CheckBox) findViewById(R.id.checkBoxSabado);
        checkDomingo = (CheckBox) findViewById(R.id.checkBoxDomingo);


        checkLunes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                  @Override
                                                  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                      if (isChecked) {
                                                          contador++;
                                                      } else {
                                                          contador--;
                                                      }
                                                      tvNumDias.setText(String.valueOf(contador));
                                                  }
                                              }
        );

        checkMartes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                   @Override
                                                   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                       if (isChecked) {
                                                           contador++;
                                                       } else {
                                                           contador--;
                                                       }
                                                       tvNumDias.setText(String.valueOf(contador));
                                                   }
                                               }
        );

        checkMiercoles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                      @Override
                                                      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                          if (isChecked) {
                                                              contador++;
                                                          } else {
                                                              contador--;
                                                          }
                                                          tvNumDias.setText(String.valueOf(contador));
                                                      }
                                                  }
        );

        checkJueves.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                   @Override
                                                   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                       if (isChecked) {
                                                           contador++;
                                                       } else {
                                                           contador--;
                                                       }
                                                       tvNumDias.setText(String.valueOf(contador));
                                                   }
                                               }
        );

        checkViernes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            contador++;
                                                        } else {
                                                            contador--;
                                                        }
                                                        tvNumDias.setText(String.valueOf(contador));
                                                    }
                                                }
        );

        checkSabado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                   @Override
                                                   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                       if (isChecked) {
                                                           contador++;
                                                       } else {
                                                           contador--;
                                                       }
                                                       tvNumDias.setText(String.valueOf(contador));
                                                   }
                                               }
        );

        checkDomingo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            contador++;
                                                        } else {
                                                            contador--;
                                                        }
                                                        tvNumDias.setText(String.valueOf(contador));
                                                    }
                                                }
        );
    }

    public void salir(View v) {
        finish();
    }

    public void ok(View view) {
        Intent i = new Intent(this, seleccion_ejercicios.class);
        startActivity(i);
    }
}
