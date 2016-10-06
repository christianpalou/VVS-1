/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.sensor;

import vvs.piscinas.Piscina;


public class SensorNivelPH implements Sensor {

    private Piscina piscina;
    
    public SensorNivelPH (Piscina piscina){
        this.piscina=piscina;
    }
    
    public void medirNivelPH(float nivel){
        this.piscina.setNivelPH(nivel);
    }
    @Override
    public Piscina getPiscina() {
        return(piscina);
    }
}
