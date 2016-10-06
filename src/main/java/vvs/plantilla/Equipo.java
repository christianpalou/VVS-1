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
public class Equipo {

	final private String nombre;
	private Plantilla plantilla;

	public Equipo(String nombre) {
		this.nombre = nombre;
		plantilla = new Plantilla();
	}

	public String getNombre() {
		return nombre;
	}

	public void setEmpleado(Empleado empleado) {
		plantilla.addEmpleado(empleado);
	}

	public void setEquipo(Equipo equipo) {
		plantilla.addEquipo(equipo);
	}

	public String avisar() {

		StringBuilder sb = new StringBuilder();
		sb.append("* Avisado equipo \"" + this.getNombre() + "\"\n");
		sb.append(plantilla.avisar());
		return (new String(sb));
	}

}
