package com.upm.ipo.gymnasium;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;

/**
 * Created by Jonathan on 10/12/2016.
 */

public class Adaptador_ViewPagerPrincipal extends FragmentPagerAdapter {

    // en esta variable almacenaremos el nº de secciones
    int numeroDeSecciones;

    public Adaptador_ViewPagerPrincipal(FragmentManager fm, int numeroDeSecciones) {
        super(fm);
        this.numeroDeSecciones=numeroDeSecciones;
    }

    @Override
    public Fragment getItem(int position) {
        // recibimos la posición por parámetro y en función de ella devolvemos el Fragment correspondiente a esa sección.
        switch (position) {
            case 0: // siempre empieza desde 0
                return new Fragment_dia1();
            case 1:
                return new Fragment_dia2();
            case 2:
                return new Fragment_dia3();
            // si la posición recibida no se corresponde a ninguna sección
            default:
                return null;
        }
    }

    /*  getCount() devuelve el nº de secciones, dato que recibiremos cuando instanciemos el adaptador
    desde nuestra actividad principal */
    @Override
    public int getCount() {
        return numeroDeSecciones;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // recibimos la posición por parámetro y en función de ella devolvemos el titulo correspondiente.
        switch (position) {
            case 0: // siempre empieza desde 0, la primera Tab es 0
                return "Dia 1";
            case 1:
                return "Dia 2";
            case 2:
                return "Dia 3";

            // si la posición recibida no se corresponde a ninguna sección
            default:
                return null;
        }

    }
}
