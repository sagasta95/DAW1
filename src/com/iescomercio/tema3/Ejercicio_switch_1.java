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
public class Ejercicio_switch_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x;
        
        System.out.print("Introduce una calificacion de 0 a 10: ");
        x = sc.nextInt();
        
        if((x < 11) && (x > -1)){            
            switch(x){    
                case 0: case 1:  
                    System.out.println("Muy deficiente");
                    break;                
                case 2: case 3: case 4:
                    System.out.println("Insuficiente");
                    break;                
                case 5:
                    System.out.println("Suficiente");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7: case 8:
                    System.out.println("Notable");
                    break;
                case 9: case 10:
                    System.out.println("Sobresaliente");
                    break;
            }
        }
        else{
            System.out.println("El numero introducido no esta dentro del rango estipulado.");
        }
    }
}
