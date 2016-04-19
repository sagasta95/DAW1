/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.traduccion;

/**
 *
 * @author VESPERTINO
 */
public class Marcador {
    private int puntos;
    
    public Marcador(){
        puntos = 0;
    }
    
    public void ponAcierto(int n){
        if(n==2)
            puntos = puntos + 100;
        if(n==1)
            puntos = puntos + 50;
    }

    @Override
    public String toString() {
        return "Puntuacion: " + puntos;
    }
    
    
    
    
}
