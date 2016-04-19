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
public class Ejercicio_bucles_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x = 1, par = 0, impar = 0;
        
        System.out.println("Introduce numeros enteros, la secuencia termina cuando introduzcas un 0.");
                    
        while(x != 0){
            System.out.print("Introduce un numero: ");
            x = sc.nextInt();
            if(x != 0){
                if(x % 2 == 0){
                    par++;
                }
                else{
                    impar++;
                }
            }
        }
        System.out.printf("Has introducido %d numeros pares y %d numeros impares.\n", par, impar);
    }
}
