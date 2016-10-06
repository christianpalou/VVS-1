/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.registro;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author alejandro.peral
 */
public class Registro implements Suceso {

    private int numeroRegistros;
    private LinkedList<Suceso> registro;

    public Registro(int tamaño) {
        this.numeroRegistros = tamaño;
        this.registro = new LinkedList();
    }

    public int getNumeroRegistros() {
        return this.numeroRegistros;
    }

    public void setNumeroRegistros(int tam) {
        if (this.numeroRegistros > tam) {
            int i;
            for (i = 0; i < (this.numeroRegistros - tam); i++) {
                this.registro.removeFirst();
            }
        }
        this.numeroRegistros = tam;
    }

    public void addSuceso(Suceso suceso) {
        this.registro.add(suceso);
        if (this.registro.size() > this.numeroRegistros) {
            this.registro.removeFirst();
        }
    }

    public String informe() {
        Iterator aux = registro.listIterator();
        StringBuilder sb = new StringBuilder();
        while (aux.hasNext()) {
            sb.append(aux.next().toString());
        }
        return (new String(sb));
    }

    public void borrar() {
        this.registro.removeAll(registro);
    }

}
