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
public class Ejercicio_switch_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x;
        
        System.out.print("Introduce una calificacion de 0 a 10: ");
        x = sc.nextInt();
        
        if((x < 11) && (x > -1)){
            switch(x){    
                case 0: 
                    System.out.println("Cero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Cuatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7: 
                    System.out.println("Siete");
                    break;
                case 8:
                    System.out.println("Ocho");
                    break;
                case 9: 
                    System.out.println("Nueve");
                    break;
                case 10:
                    System.out.println("Diez");
                    break;
            }
        }
        else{
            System.out.println("El numero introdsucido no etsa dentro del rango estipulado.");
        }
    }
}
