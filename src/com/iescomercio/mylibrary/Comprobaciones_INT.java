/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.mylibrary;

/**
 *
 * @author VESPERTINO
 */
public class Comprobaciones_INT {
    
    public static boolean esPositivo(int a) {
        if (a > 0) 
            return true; 
        else {
            System.out.println("El numero " + a + " no es positivo.");
            return false;
        }
    }
    public static boolean esNegativo(int a){
        if(a < 0)
            return true;
        else{
            System.out.println("El numero " + a + " no es negativo.");
            return false;
        }

    }
}
