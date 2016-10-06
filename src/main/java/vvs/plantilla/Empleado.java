/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.plantilla;

/**
 *
 * @author alejandro.peral
 */
public abstract class Empleado {

    public enum Genero {

        H, M
    }

    final private String nombre;
    final private Genero genero;

    public Empleado(String nombre, Genero genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    protected String getAvisadoGenero() {
        if (this.genero == Genero.H) {
            return ("Avisado");
        } else {
            return ("Avisada");
        }
    }

    public abstract String avisar();
}
