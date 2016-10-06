/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.sensor;

import vvs.piscinas.Piscina;


public class SensorPersonas implements Sensor {

    private Piscina piscina;
    
     public SensorPersonas (Piscina piscina){
        this.piscina=piscina;
    }
    
    public void medirPersonas(int personas){
        this.piscina.setPersonas(personas);
    }
    @Override
    public Piscina getPiscina() {
        return(piscina);
    }
}
