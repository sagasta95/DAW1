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
public class Ejercicio_if_8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("Introduce un numero entre 0 y 99.999: ");
        n = sc.nextInt();
        
        if((n > -1) && (n < 100000)){
            if(n < 10){
                System.out.println("El numero introducido tiene 1 cifra.");
            }
            else{
                if(n < 100){
                    System.out.println("El numero introducido tiene 2 cifras.");
                }
                else{
                    if(n < 1000){
                        System.out.println("El numero introducido tiene 3 cifras.");
                    }
                    else{
                        if(n < 10000){
                            System.out.println("El numero introducido tiene 4 cifras.");
                        }
                        else{
                            System.out.println("El numero introducido tiene 5 cifras.");
                        }
                    }
                }
            }
        }
        else{
            System.out.println("El numero introducido no esta dentro del rango.");
        }
    }
}
