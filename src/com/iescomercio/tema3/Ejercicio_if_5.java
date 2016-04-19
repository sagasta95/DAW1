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
public class Ejercicio_if_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();
        
        if(n == 0){
            System.out.println("El numero introducido es 0.");
        }
        else if(n > 0){
            System.out.println("El numero introducido es Positivo.");
        }
        else{
            System.out.println("El numero introducido es Negativo.");
        }
    }
}
