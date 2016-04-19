/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Ejercicio_bucles_anidados_6 {

    public static void main(String[] args) {
        int alto, ancho, a, b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Pasame el ancho del rectangulo");
            ancho = sc.nextInt();
            if (ancho <= 0) {
                System.out.println("El numero debe ser positivo");
            }
        } while (ancho <= 0);
        do {
            System.out.println("Pasame la altura del rectangulo");
            alto = sc.nextInt();
            if (alto <= 0) {
                System.out.println("El numero debe ser positivo");
            } else if (alto > ancho) {
                System.out.println("En un rectangulo la altura no puede ser mayor que el anchura");
            }
        } while (ancho <= 0 || alto > ancho);

        for (a = 1; a <= alto; a++) {
            if (a == 1) {
                for (b = 1; b <= ancho; b++) {
                    System.out.print("*");
                }
            } else if (a == alto) {
                for (b = 1; b <= ancho; b++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (b = 1; b <= ancho - 2; b++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
