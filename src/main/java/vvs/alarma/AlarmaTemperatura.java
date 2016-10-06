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
public class AlarmaTemperatura extends Alarma {

	final float maximo;
	final float minimo;

	public AlarmaTemperatura(float max, float min) {
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
			if (piscina.getTemperatura() > this.maximo) {
				sb.append("# Parámetro \"temperatura\", excede de " + this.maximo + ", numero actual: "
						+ piscina.getTemperatura() + "\n");
				sb.append(super.avisar());
				registro.add(new String(sb));
				return;
			}
			if (piscina.getTemperatura() < this.minimo) {
				sb.append("# Parámetro \"temperatura\", inferior a " + this.minimo + ", numero actual: "
						+ piscina.getTemperatura() + "\n");
				sb.append(super.avisar());
				registro.add(new String(sb));
				return;
			}
		}
	}

}
