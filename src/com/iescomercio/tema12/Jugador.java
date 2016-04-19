/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Jugador implements  Serializable {
    
    private String nombre;
    private long puntos;


    public Jugador(String nombre, long puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public long getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return nombre + " " + puntos;
    }
      
    
}
