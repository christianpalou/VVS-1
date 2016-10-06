/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.piscinas;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;

import vvs.registro.Registro;
import vvs.registro.Suceso;
import vvs.registro.SucesoNivelAgua;
import vvs.registro.SucesoNivelCloro;
import vvs.registro.SucesoPersonas;
import vvs.registro.SucesoTemperatura;
import vvs.sensor.Sensor;

/**
 *
 * @author alejandro.peral
 */
public class Piscina extends Observable {

	private final String nombre;
	private final String ubicacion;
	private float nivelAgua;
	private float temperatura;
	private float nivelCloro;
	private float nivelPH;
	private int personas;
	EstadoPiscina estado;
	Registro registro;
	private ArrayList<Sensor> sensores;

	public Piscina(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.registro = new Registro(10);
		this.estado = Mantenimiento.getInstancia();
		this.sensores = new ArrayList();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public float getNivelAgua() {
		return this.nivelAgua;
	}

	public float getTemperatura() {
		return this.temperatura;
	}

	public float getNivelCloro() {
		return this.nivelCloro;
	}

	public float getNivelPH() {
		return this.nivelPH;
	}

	public int getPersonas() {
		return this.personas;
	}

	public EstadoPiscina getEstado() {
		return this.estado;
	}

	// ----------------------------------------------------
	public void setNivelAgua(float nivel) {
		if (nivel < 0) {
			throw new IllegalArgumentException();
		}
		if (nivel == this.nivelAgua) {
			return;
		}
		float nivel_inicial = this.nivelAgua;
		this.nivelAgua = nivel;
		this.setChanged();
		this.notifyObservers();
		if (estado.registrarParametros(this)) {
			registro.addSuceso(new SucesoNivelAgua(nivel_inicial, nivel));
		}
	}

	public void setTemperatura(float temperatura) {
		if (temperatura < 0) {
			throw new IllegalArgumentException();
		}
		if (temperatura == this.temperatura) {
			return;
		}
		float temperatura_inicial = this.temperatura;
		this.temperatura = temperatura;
		this.setChanged();
		this.notifyObservers();
		if (estado.registrarParametros(this)) {
			registro.addSuceso(new SucesoTemperatura(temperatura_inicial, temperatura));
		}
	}

	public void setNivelCloro(float nivel) {
		if (nivel < 0) {
			throw new IllegalArgumentException();
		}
		if (nivel == this.nivelCloro) {
			return;
		}
		float nivel_inicial = this.nivelCloro;
		this.nivelCloro = nivel;
		this.setChanged();
		this.notifyObservers();
		if (estado.registrarParametros(this)) {
			registro.addSuceso(new SucesoNivelCloro(nivel_inicial, nivel));
		}
	}

	public void setNivelPH(float nivel) {
		if (nivel < 0) {
			throw new IllegalArgumentException();
		}
		if (nivel == this.nivelPH) {
			return;
		}
		float nivel_inicial = this.nivelPH;
		this.nivelPH = nivel;
		this.setChanged();
		this.notifyObservers();
		if (estado.registrarParametros(this)) {
			registro.addSuceso(new SucesoNivelCloro(nivel_inicial, nivel));
		}
	}

	public void setPersonas(int personas) {
		if (personas < 0) {
			throw new IllegalArgumentException();
		}

		int personas_inicial = this.personas;
		this.personas = personas;
		this.setChanged();
		this.notifyObservers();
		if (estado.registrarParametros(this)) {
			registro.addSuceso(new SucesoPersonas(personas_inicial, personas));
		}
		estado.notificarPersonas(this);
	}

	public void setEstado(EstadoPiscina estado) {
		this.estado = estado;

	}

	// -----------------------------------------------------------
	void borrarRegistro() {
		this.registro.borrar();
	}

	void nuevoSuceso(Suceso suceso) {
		this.registro.addSuceso(suceso);
	}

	public String informe() {
		StringBuilder sb = new StringBuilder();
		sb.append("# Informe de piscina \"" + this.getNombre() + "\", ubicada en \"" + this.getUbicacion() + "\".\n");
		Date llamada = new Date();
		sb.append("# Generado el " + llamada.toString() + "\n");
		sb.append(this.registro.informe());
		sb.append("# Fase actual: " + this.getEstado().toString() + "\n");
		return new String(sb);
	}

	public void setLongitudRegistro(int tam) {
		this.registro.setNumeroRegistros(tam);
	}

	public void activar() {
		this.estado.activar(this);
	}

	public void cerrar() {
		this.estado.cerrar(this);
	}

	public void evacuar() {
		this.estado.evacuar(this);
	}

	public void mantenimiento() {
		this.estado.mantenimiento(this);
	}

	public boolean lanzarAlarmas() {
		return this.estado.lanzarAlarmas(this);
	}

	public void addSensor(Sensor sensor) {
		if ((sensor != null) && (!this.sensores.contains(sensor)) && (sensor.getPiscina() == this)) {
			this.sensores.add(sensor);
		} else {
			throw new IllegalArgumentException();
		}

	}
}
