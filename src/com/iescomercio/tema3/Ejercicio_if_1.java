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
 * Implementar un programa que pida los coeficientes de una ecuacion de segundo grado y mostrar por pantalla los dos resultados de la ecuacion.
 */
public class Ejercicio_if_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float a, b, c, x1, x2;
        
        System.out.print("Introduce el valor de a: ");
        a = sc.nextFloat();
        System.out.print("Introduce el valor de b: ");
        b = sc.nextFloat();
        System.out.print("Introduce el valor de c: ");
        c = sc.nextFloat();
        
        if((b * b - 4 * a * c) >= 0){
            x1 = (float)(-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
            x2 = (float)(-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
            System.out.printf("Las soluciones de la ecuacion son: %.4f y %.4f\n", x1, x2);
        }
        else{
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        
        
    }
        
}
