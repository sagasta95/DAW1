/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 * Mostrar por pantalla los multiplos de 7 hasta 7000.
 * @author VESPERTINO
 */
public class Prueba_do {
    public static void main(String[] args) {
        
        int inicio = 7;
        
        do{
            System.out.printf("Numero: %d\n", inicio);
            inicio = inicio + 7;
        } while (inicio<7007);
    }
}
