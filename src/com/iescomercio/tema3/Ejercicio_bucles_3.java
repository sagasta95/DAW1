/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 *3.	Programa en Java que muestra por pantalla los números de la serie  7,14,21,28,35 … hasta 7000
 * @author VESPERTINO
 */
public class Ejercicio_bucles_3 {
    public static void main(String[] args) {
        int inicio=7, xfinal=7000, contador=7;
        
        do{
            System.out.printf("%d\n",inicio);
            inicio= inicio+contador;
        }while  (inicio<(xfinal+contador));
    }
       
}
