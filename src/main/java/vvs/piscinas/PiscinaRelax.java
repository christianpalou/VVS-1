/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.piscinas;

import vvs.registro.SucesoNivelSales;

/**
 *
 * @author alejandro.peral
 */
public class PiscinaRelax extends Piscina {

	float nivelSales;

	public PiscinaRelax(String nombre, String ubicacion) {
		super(nombre, ubicacion);
	}

	public float getNivelSales() {
		return this.nivelSales;
	}

	public void setNivelSales(float nivel) {
		if (nivel < 0) {
			throw new IllegalArgumentException();
		}
		if (nivel == this.nivelSales) {
			return;
		}
		float nivel_inicial = this.nivelSales;
		this.nivelSales = nivel;
		this.setChanged();
		this.notifyObservers();
		if (estado.registrarParametros(this)) {
			registro.addSuceso(new SucesoNivelSales(nivel_inicial, nivel));
		}

	}
}
