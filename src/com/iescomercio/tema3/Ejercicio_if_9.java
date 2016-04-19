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
public class Ejercicio_if_9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x, dm, m, c, d, u, ni;
        
        System.out.print("Introduce un numero entero entre 0 y 99.999: ");
        x = sc.nextInt();
        
        if((x > 0) && (x < 100000)){
            
            dm = x /10000;
            m = (x % 10000) / 1000;
            c = (x % 1000) / 100;
            d = (x % 100) /10;
            u = (x % 10);
            
            if((x > 9999) && (dm == u) && (m == d)){
                System.out.println("El numero es capicua.");
            }
            else if((x > 999) && (m == u) && (c == d)){
                System.out.println("El numero es capicua.");
            }
            else if((x > 99) && (c == u)){
                System.out.println("El numero es capicua.");
            }
            else if((x > 9) && (d == u)){
                System.out.println("El numero es capicua.");
            }
            else if(x < 10){
                System.out.println("El numero es de una sola cifra.");
            }
            else{
                System.out.println("El numero no es capicua.");
            }
        }
        else{
            System.out.println("El numero introducido no esta dentro del rango.");
        }
    }
}
