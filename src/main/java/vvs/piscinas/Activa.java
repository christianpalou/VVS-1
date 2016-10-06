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
public class Activa implements EstadoPiscina {

	private static final Activa instancia = new Activa();

	private Activa() {
	}

	public static Activa getInstancia() {
		return instancia;
	}

	@Override
	public String toString() {
		return "Activa";
	}

	@Override
	public void activar(Piscina piscina) {
		System.out.println("La piscina ya esta activada");
	}

	@Override
	public void evacuar(Piscina piscina) {
		piscina.nuevoSuceso(new SucesoEstado("Activa", "Evacuación"));
		piscina.setEstado(Evacuacion.getInstancia());
	}

	@Override
	public void cerrar(Piscina piscina) {
		System.out.println("La piscina debe ser evacuada");
	}

	@Override
	public void mantenimiento(Piscina piscina) {
		System.out.println("La piscina debe ser evacuada");
	}

	@Override
	public boolean registrarParametros(Piscina piscina) {
		return true;
	}

	@Override
	public void notificarPersonas(Piscina piscina) {

	}

	@Override
	public boolean saltarAlarmaNiveles(Piscina piscina) {
		return (true);
	}

	@Override
	public boolean saltarAlarmaPersonas(Piscina piscina) {
		return (true);
	}

	@Override
	public boolean lanzarAlarmas(Piscina piscina) {
		return true;
	}

}
