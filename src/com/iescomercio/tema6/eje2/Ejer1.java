/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.eje2;

/**
 * conversiones String, objeto, primitivo entre ellos
 *
 * @author VESPERTINO
 */
public class Ejer1 {

    public static void main(String[] args) {
        String a = "2";
        
        Integer b = Integer.valueOf(a);// conversion de String "a" a objeto "wrapper"
        String e = b + "";//conversion de objeto "wrapper" a tipo String

        
        int c = Integer.parseInt(a);// conversion de String "a" a tipo primitivo int
        String d = Integer.toString(c);// conversion de primitivo a String
        
        
        int f = b; //de tipo objeto "wrapper" a primitivo (ahora no es necesario la conversion)        
        Integer m= f;//de tipo primitivo aobjeto "wrapper"
    }

}
