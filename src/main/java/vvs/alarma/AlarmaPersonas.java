/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.alarma;

import java.util.Observable;

import vvs.piscinas.Activa;
import vvs.piscinas.Piscina;

/**
 *
 * @author Alejandro
 */
public class AlarmaPersonas extends Alarma {

	int numeroMaximo;

	public AlarmaPersonas(int Max) {
		this.numeroMaximo = Max;
	}

	@Override
	public void update(Observable o, Object arg) {
		Piscina piscina = (Piscina) o;
		StringBuilder sb = new StringBuilder();
		sb.append("# Alarma en piscina \"" + piscina.getNombre() + "\" (" + piscina.getEstado().toString()
				+ "), ubicada en \"" + piscina.getUbicacion() + "\".\n");
		if (piscina.getPersonas() > this.numeroMaximo) {
			sb.append("# Parámetro \"personas\", exceden de " + this.numeroMaximo + ", numero actual: "
					+ piscina.getPersonas() + "\n");
			sb.append(super.avisar());
			registro.add(new String(sb));
			return;
		}
		if ((piscina.getPersonas() != 0) && (piscina.getEstado() != Activa.getInstancia())) {
			sb.append("# Parámetro \"personas\", exceden de 0 en fase de " + piscina.getEstado().toString()
					+ ", numero actual: " + piscina.getPersonas() + "\n");
			sb.append(super.avisar());
			registro.add(new String(sb));
			return;
		}
	}

}
