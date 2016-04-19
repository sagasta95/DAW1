/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio_bucles_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cont, x, suma = 0;
        float media = 0;

        for (cont= 0; cont < 3; cont++) {
            System.out.print("Introduce un numero entero: ");
            x = sc.nextInt();           
            if (x == 0) {
                cont--;
            } else {
                suma = suma + x;            
            }
        }
        System.out.println("La suma de los numeros introducidos es: " + suma);
        media =  suma / (float)cont;
        System.out.printf("La media de los numeros introducidos es: %.2f\n", media);
    }
}
