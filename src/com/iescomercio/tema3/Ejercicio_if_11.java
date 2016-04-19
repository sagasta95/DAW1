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
public class Ejercicio_if_11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x, dm, m, c, d, u;
        
        System.out.print("Introduce un numero entero entre 0 y 99.999: ");
        x = sc.nextInt();
        
        if((x > 0) && (x < 100000)){
            
            dm = x /10000;
            m = (x % 10000) / 1000;
            c = (x % 1000) / 100;
            d = (x % 100) /10;
            u = (x % 10);
            
            System.out.println("El");
        }
        else{
            System.out.println("El numero introducido no esta dentro del rango.");
        }
    }
}
