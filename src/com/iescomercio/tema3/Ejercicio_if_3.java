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
public class Ejercicio_if_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Introduce un número entero: ");
        a = sc.nextInt();
        
        if(a != 0){
            if((a % 2) == 0){
                System.out.println("El numero " + a + " es Par");
            }
            else{
                System.out.println("El numero " + a + " es Impar");
            }
        }
        else{
            System.out.println("El numero 0 no es Par ni Impar.");
        }
    }
}
