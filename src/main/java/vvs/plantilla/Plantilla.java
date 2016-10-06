/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.plantilla;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alejandro.peral
 */
public class Plantilla {

    private List<Empleado> empleados;
    private List<Equipo> equipos;

    public Plantilla() {
        empleados = new <Empleado>ArrayList();
        equipos = new <Equipo>ArrayList();
    }

    public void addEmpleado(Empleado empleado) {
        if (!empleados.contains(empleado)) {
            empleados.add(empleado);
        }
    }

    public void addEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
        }
    }

    public String avisar() {
        Iterator<Empleado> aux = empleados.listIterator();
        Iterator<Equipo> aux1 = equipos.listIterator();
        StringBuilder sb = new StringBuilder("");
        while (aux.hasNext()) {
            sb.append(aux.next().avisar());
        }
        while (aux1.hasNext()) {
            sb.append(aux1.next().avisar());
        }
        return (new String(sb));
    }

}
