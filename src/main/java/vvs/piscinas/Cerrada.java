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
public class Cerrada implements EstadoPiscina {

	private static final Cerrada instancia = new Cerrada();

	private Cerrada() {
	}

	public static Cerrada getInstancia() {
		return instancia;
	}

	@Override
	public String toString() {
		return "Cerrada";
	}

	@Override
	public void activar(Piscina piscina) {
		System.out.println("La piscina está cerrada");
	}

	@Override
	public void evacuar(Piscina piscina) {
		System.out.println("La piscina está cerrada");
	}

	@Override
	public void cerrar(Piscina piscina) {
		System.out.println("La piscina ya está cerrada");
	}

	@Override
	public void mantenimiento(Piscina piscina) {
		piscina.nuevoSuceso(new SucesoEstado("Cerrada", "Mantenimiento"));
		piscina.setEstado(Evacuacion.getInstancia());
		;
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
		return false;
	}

}
