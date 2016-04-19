/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.ejercicio5;

import com.iescomercio.tema4.aleatorios.Aleatorios;

/**
 *
 * @author VESPERTINO
 */
public class Taller {

    private Coche coche;
    private String averia;
    private int nca;

    public Taller() {
        coche = null;
        averia = null;
        nca = 0;
    }

    public boolean aceptarCoche(Coche pcoche, String paveria) {
        if (coche == null) {
            coche = pcoche;
            averia = paveria;
            System.out.println("El coche ha sido aceptado.");
            return true;
        } else {
            System.out.println("El taller esta lleno.");
            return false;
        }
    }

    public boolean devolverCoche() {
        Aleatorios x = new Aleatorios(100, 500);
        if(coche != null){
            coche.acumularAveria(x.dameAleatorio());
            if(averia=="aceite"){
                coche.getMotor().setLa(coche.getMotor().getLa() + 10);
            }
            coche = null;
            averia = null;
            System.out.println("El coche ha sido devuelto.");
            return true;
        } else{
            System.out.println("El taller esta vacio.");
            return false;
        }

    }
}
