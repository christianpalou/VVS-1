/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.sensor;

import vvs.piscinas.Piscina;


public class SensorTemperatura implements Sensor {

    private Piscina piscina;
    
    public SensorTemperatura (Piscina piscina){
        this.piscina=piscina;
    }
    
    public void medirTemperatura(float nivel){
        this.piscina.setTemperatura(nivel);
    }
    @Override
    public Piscina getPiscina() {
        return(piscina);
    }
}
