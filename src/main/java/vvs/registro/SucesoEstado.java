/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class SucesoEstado implements Suceso {

    final Date momento;
    String inicio;
    String fin;

    public SucesoEstado(String inicio, String fin) {
        momento = new Date();
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return ("- " + new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(momento) + " Cambio de fase de \"" + inicio + "\" a \"" + fin + "\"\n");
    }
}
