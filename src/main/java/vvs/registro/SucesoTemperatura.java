/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SucesoTemperatura implements Suceso {

    final Date momento;
    float inicio;
    float fin;

    public SucesoTemperatura(float inicio, float fin) {
        momento = new Date();
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return ("- " + new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(momento) + " Parametro \"temperatura\" cambia de " + inicio
                + "º a " + fin + "º\n");
    }

}
