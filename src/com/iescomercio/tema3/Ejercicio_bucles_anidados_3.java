/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 *Tablas de multiplicar.
 * 
 * @author VESPERTINO
 */
public class Ejercicio_bucles_anidados_3 {
    public static void main(String[] args) {
        
        int n, i;
        
        for(n = 1; n<=10; n++){
            System.out.println("Tabla del " + n + ":");
            for(i = 1; i<=10; i++){
                System.out.println(n + " * " + i + " = " + n*i);
            }
        }
    }
}