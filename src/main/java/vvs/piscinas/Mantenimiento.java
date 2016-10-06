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
public class Mantenimiento implements EstadoPiscina {

	private static final Mantenimiento instancia = new Mantenimiento();

	private Mantenimiento() {
	}

	public static Mantenimiento getInstancia() {
		return instancia;
	}

	@Override
	public String toString() {
		return "Mantenimiento";
	}

	@Override
	public void activar(Piscina piscina) {
		piscina.nuevoSuceso(new SucesoEstado("Mantenimiento", "Activa"));
		piscina.setEstado(Activa.getInstancia());
	}

	@Override
	public void evacuar(Piscina piscina) {
		System.out.println("La piscina está en mantenimiento");
	}

	@Override
	public void cerrar(Piscina piscina) {
		piscina.nuevoSuceso(new SucesoEstado("Mantenimiento", "Cerrada"));
		piscina.setEstado(Cerrada.getInstancia());
		;
		piscina.borrarRegistro();
	}

	@Override
	public void mantenimiento(Piscina piscina) {
		System.out.println("La piscina ya está en mantenimiento");
	}

	@Override
	public boolean registrarParametros(Piscina piscina) {
		return false;
	}

	@Override
	public void notificarPersonas(Piscina piscina) {

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
		return (false);
	}
}
