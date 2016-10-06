/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.plantilla;

public class Marketing extends Empleado {

    public Marketing(String nombre, Genero genero) {
        super(nombre, genero);
    }

    @Override
    public String avisar() {
        return ("- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(marketing)\n");
    }
}
