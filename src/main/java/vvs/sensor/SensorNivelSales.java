/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.sensor;

import vvs.piscinas.PiscinaRelax;

/**
 *
 * @author Alejandro
 */
public class SensorNivelSales implements Sensor {

    private PiscinaRelax piscina;
    
    public SensorNivelSales (PiscinaRelax piscina){
        this.piscina=piscina;
    }
    
    public void medirNivelSales(float nivel){
        this.piscina.setNivelSales(nivel);
    }
    @Override
    public PiscinaRelax getPiscina() {
        return(piscina);
    }
}