/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 *Realizar un programa que muestre los 100 primeros numeros enteros por pantalla.
 * @author VESPERTINO
 */
public class Prueba_while {
    public static void main(String[] args) {
        
        int n = 0;
        
        while(n < 100){
            n = n + 1;
            System.out.println("Numero: " + n);
        }
    }
}
