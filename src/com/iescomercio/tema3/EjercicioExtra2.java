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
/*Implementar un programa en java que pida a 3 alumnos su edad y calcule y muestre por pantalla la media de edad de los 3 alumnos*/
public class EjercicioExtra2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int e1, e2, e3;
        float media;
        
        System.out.print("Introduce la edad del primer Alumno: ");
        e1 = sc.nextInt();
        System.out.print("Introduce la edad del segundo Alumno: ");
        e2 = sc.nextInt();
        System.out.print("Introduce la edad del tercer Alumno: ");
        e3 = sc.nextInt();
        
        media = (float)(e1 + e2 + e3)/3;
        
        System.out.printf("La media de edad de los 3 alumnos es: %.2f\n", media);
    }
}
