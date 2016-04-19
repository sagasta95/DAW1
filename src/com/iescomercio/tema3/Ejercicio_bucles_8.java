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
public class Ejercicio_bucles_8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x=1, c=0;
        
        System.out.println("La secuencia de introducción, finalizara cuando introduzcas un numero negativo: ");
        
        while(x >= 0){
            System.out.print("Introduce un numero: ");
            x = sc.nextInt();
            if(x >= 0)
                c++;
        }
        System.out.println("Has introducido " + c + " numeros.");
    }
}
    
