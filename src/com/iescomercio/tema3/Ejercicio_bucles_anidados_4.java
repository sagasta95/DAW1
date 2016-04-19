/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * 4. Realizar un programa en java que pida un numero entero positivo N mayor de
 * 0 y calcula y muestra por pantalla un cuadrado de tamaño NxN con asteriscos.
 *
 * @author Ángel
 */
public class Ejercicio_bucles_anidados_4 {

    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasame un numero positivo mayor que 0");
        do {
            a = sc.nextInt();
            if (a <= 0) {
                System.out.println("El numero debe ser mayor de 0");
            }
        } while (a <= 0);

        for (b = 1; b <= a; b++) {
            if (b == 1) {
                for (c = 1; c <= a; c++) {
                    System.out.print("* ");
                }
            } else if (b == a) {
                for (d = 1; d <= a; d++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (e = 1; e <= a - 2; e++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
