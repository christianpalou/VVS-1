/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.sensor;

import vvs.piscinas.Piscina;


public class SensorNivelCloro implements Sensor {

    private Piscina piscina;
    
    public SensorNivelCloro (Piscina piscina){
        this.piscina=piscina;
    }
    
    public void medirNivelCloro(float nivel){
        this.piscina.setNivelCloro(nivel);
    }
    @Override
    public Piscina getPiscina() {
        return(piscina);
    }
}
