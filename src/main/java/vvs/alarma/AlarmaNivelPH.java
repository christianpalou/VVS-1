/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.alarma;

import java.util.Observable;

import vvs.piscinas.Piscina;

/**
 *
 * @author Alejandro
 */
public class AlarmaNivelPH extends Alarma {

	final float maximo;
	final float minimo;

	public AlarmaNivelPH(float max, float min) {
		if ((max < min) || (min < 0)) {
			throw new IllegalArgumentException();
		}
		this.maximo = max;
		this.minimo = min;
	}

	@Override
	public void update(Observable o, Object arg) {
		Piscina piscina = (Piscina) o;
		if (piscina.lanzarAlarmas()) {
			StringBuilder sb = new StringBuilder();
			sb.append("# Alarma en piscina \"" + piscina.getNombre() + "\" (" + piscina.getEstado().toString()
					+ "), ubicada en \"" + piscina.getUbicacion() + "\".\n");
			if (piscina.getNivelPH() > this.maximo) {
				sb.append("# Parámetro \"NivelPH\", excede de " + this.maximo + ", numero actual: "
						+ piscina.getNivelPH() + "\n");
				sb.append(super.avisar());
				registro.add(new String(sb));
				return;
			}
			if (piscina.getNivelPH() < this.minimo) {
				sb.append("# Parámetro \"NivelPH\", inferior a " + this.minimo + ", numero actual: "
						+ piscina.getNivelPH() + "\n");
				sb.append(super.avisar());
				registro.add(new String(sb));
				return;
			}
		}
	}

}
