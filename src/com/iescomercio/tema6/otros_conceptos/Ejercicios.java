/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.otros_conceptos;

import com.iescomercio.mylibrary.Comprobaciones_INT;
import com.iescomercio.mylibrary.MyString;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicios {

    public static void ejercicio3(Paquete p) {

        if (Comprobaciones_INT.esNegativo(p.getA())) {
            p.setA(Math.abs(p.getA()));
        }
        if (Comprobaciones_INT.esNegativo(p.getB())) {
            p.setB(Math.abs(p.getB()));
        }
        if (Comprobaciones_INT.esNegativo(p.getC())) {
            p.setC(Math.abs(p.getC()));
        }

    }
    
    public static void ejercicio4(){
        
        StringBuilder sb = new StringBuilder();
        
        MyString.stringNumAleatorios(sb, 10);
        
        System.out.println("Cadena: " + sb + "\nSuma: " + MyString.stringNumSuma(sb) + "\nMedia: " + MyString.stringNumMedia(sb));
    }
}
