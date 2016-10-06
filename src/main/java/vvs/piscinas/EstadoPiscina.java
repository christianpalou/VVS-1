/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.piscinas;

import vvs.piscinas.Piscina;

/**
 *
 * @author Alejandro
 */
public interface EstadoPiscina {

    public boolean registrarParametros(Piscina piscina);

    public boolean saltarAlarmaNiveles(Piscina piscina);

    public boolean saltarAlarmaPersonas(Piscina piscina);

    public void activar(Piscina piscina);

    public void evacuar(Piscina piscina);

    public void cerrar(Piscina piscina);

    public void mantenimiento(Piscina piscina);

    public void notificarPersonas(Piscina piscina);
    
    public boolean lanzarAlarmas(Piscina piscina);
}
