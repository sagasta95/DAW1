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
public class Ejercicio_if_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float a, b;
        
        System.out.print("Introduce un número: ");
        a = sc.nextFloat();
        System.out.print("Introduce un segundo número: ");
        b = sc.nextFloat();
        
        if(a == b){
            System.out.println("Los numeros introducidos son iguales.");
        }
        else if(a > b){
            System.out.println("Ordenacion Ascendente: " + b + ", " + a);
        }
        else{
            System.out.println("Ordenacion Ascendente: " + a + ", " + b);
        }
    }
}
