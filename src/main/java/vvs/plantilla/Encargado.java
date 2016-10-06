/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.plantilla;

import vvs.piscinas.Piscina;

public class Encargado extends Empleado {

    public Encargado(String nombre, Genero genero) {
        super(nombre, genero);
    }

    @Override
    public String avisar() {
        return ("- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(encargado)\n");
    }

    public void activa(Piscina piscina) {
        piscina.activar();
    }
    public void mantenimiento(Piscina piscina){
        piscina.mantenimiento();
    }
    
    public void cerrar(Piscina piscina){
        piscina.cerrar();
    }

    public void evacuar(Piscina piscina){
        piscina.evacuar();
    }
}
