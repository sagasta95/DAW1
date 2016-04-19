/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.otros_conceptos;

/**
 *
 * @author VESPERTINO
 */
public class Main {
    public static void main(String[] args) {
        //  Caso prueba bueno 
        Paquete p = new Paquete(-5, -10, -65);            
        System.out.println(p);
        Ejercicios.ejercicio3(p);
        System.out.println(p);
        // Caso borde
        System.out.println("----------------------");
        Paquete p2 = new Paquete(5, 10, -65);            
        Ejercicios.ejercicio3(p2);
        System.out.println("*********************");
        Ejercicios.ejercicio4();
        System.out.println("");
    }
}
