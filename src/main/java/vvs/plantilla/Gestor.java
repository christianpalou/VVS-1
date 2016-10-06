/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.plantilla;

import vvs.piscinas.Piscina;

public class Gestor extends Empleado {

    public Gestor(String nombre, Genero genero) {
        super(nombre, genero);
    }

    @Override
    public String avisar() {
        return ("- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(gestor)\n");
    }

    public String generarInforme(Piscina piscina) {
        return piscina.informe();
    }
    public void setTamanoInforme(Piscina piscina,int tam){
        piscina.setLongitudRegistro(tam);
    }
}
