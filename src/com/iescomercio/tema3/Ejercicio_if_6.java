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
public class Ejercicio_if_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int a, b;
        
        System.out.print("Introduce un numero entero: ");
        a = sc.nextInt();
        System.out.print("Introduce un segundo numero entero: ");
        b = sc.nextInt();
        
        if(a % b == 0){
            System.out.println("El primer numero " + a + " es multiplo del segundo " + b);
        }
        else{
            System.out.println("El primer numero " + a + " no es multiplo del segundo " + b);
        }
    }
}
