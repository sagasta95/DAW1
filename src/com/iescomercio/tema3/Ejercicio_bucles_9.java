/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *  9.	Realizar un juego para adivinar un número. Para ello pedir un número N y luego ir pidiendo números indicando 
 *      “mayor” o “menor” según sea el caso con respecto a N. El proceso termina cuando el usuario acierta.
 * @author VESPERTINO
 */
public class Ejercicio_bucles_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, aux;       
        aux = (int)Math.floor(Math.random()*(100-1+1)+1);
        System.out.println(aux);
        do{
            System.out.println("Dime cual es el numero ?¿?¿: ");
            a=sc.nextInt();
            if (a>aux){
                System.out.println("tu numero es mas grande");
            }
            else if (a<aux){
                System.out.println("tu numero es mas pequeño");
            }
            else{
                System.out.println("Has acertado el numeroooooo!!!");       
            }
                       
        } while (a!=aux);
    }
    
}
