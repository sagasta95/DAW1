/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.el_instituto_2;

import com.iescomercio.tema4.aleatorios.Aleatorios;

/**
 *
 * @author VESPERTINO
 */
public class Profesor {
    
    
    public void ponerNotas(Alumno pa){
        
        Aleatorios x = new Aleatorios(0, 10);
        
        pa.getA1().setCalificacion(x.dameAleatorio());
        pa.getA2().setCalificacion(x.dameAleatorio());
        pa.getA3().setCalificacion(x.dameAleatorio());
    }
    public double calcularMedia(Alumno pa){
        
        double media, a1, a2, a3;
        
        a1 = pa.getA1().getCalificacion();
        a2 = pa.getA2().getCalificacion();
        a3 = pa.getA3().getCalificacion();
        media = (a1 + a2 +a3) / 3; 
        return media;
    }
    
}
