/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.plantilla;

public class Socorrista extends Empleado {

    public Socorrista(String nombre, Genero genero) {
        super(nombre, genero);
    }

    @Override
    public String avisar() {
        return ("- " + this.getAvisadoGenero() + " \"" + this.getNombre() + "\" " + "(socorrista)\n");
    }
}
