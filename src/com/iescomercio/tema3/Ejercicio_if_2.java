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
 * 
 */
public class Ejercicio_if_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Introduce el primer número entero: ");
        a = sc.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        b = sc.nextInt();
        
        if((a > 0) && (b > 0)){
            if(a >= b){
            System.out.println("Ordenacion Ascendente: " + b + ", " + a);
            }
            else{
            System.out.println("Ordenacion Ascendente: " + a + ", " + b);
            }
        }
        else{
            System.out.println("No esta permitido la introduccion de numeros negativos." );
        }
    }
}
