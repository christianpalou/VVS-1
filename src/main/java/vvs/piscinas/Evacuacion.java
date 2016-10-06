/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.piscinas;

import vvs.registro.SucesoEstado;

/**
 *
 * @author Alejandro
 */
public class Evacuacion implements EstadoPiscina {

	private static final Evacuacion instancia = new Evacuacion();

	private Evacuacion() {
	}

	public static Evacuacion getInstancia() {
		return instancia;
	}

	@Override
	public String toString() {
		return "Evacuación";
	}

	@Override
	public void activar(Piscina piscina) {
		System.out.println("La piscina está en evacuación");
	}

	@Override
	public void evacuar(Piscina piscina) {
		System.out.println("La piscina ya está en evacuación");
	}

	@Override
	public void cerrar(Piscina piscina) {
		System.out.println("La piscina debe acabar de ser evacuada");
	}

	@Override
	public void mantenimiento(Piscina piscina) {
		System.out.println("La piscina debe acabar de ser evacuada");
	}

	@Override
	public boolean registrarParametros(Piscina piscina) {
		return true;
	}

	@Override
	public void notificarPersonas(Piscina piscina) {
		if (piscina.getPersonas() == 0) {
			piscina.nuevoSuceso(new SucesoEstado("Evacuación", "Mantenimiento"));
			piscina.setEstado(Mantenimiento.getInstancia());
		}
	}

	@Override
	public boolean saltarAlarmaNiveles(Piscina piscina) {
		return (false);
	}

	@Override
	public boolean saltarAlarmaPersonas(Piscina piscina) {
		return (true);
	}

	@Override
	public boolean lanzarAlarmas(Piscina piscina) {
		return false;
	}
}
