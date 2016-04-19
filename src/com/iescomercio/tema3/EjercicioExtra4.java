/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 *Realizar un programa que calcule y muestre por pantalla todos los numeros de las series: 6, 9 , 12...60; 5, 50, 500...5000000.
 * @author VESPERTINO
 */
public class EjercicioExtra4 {
    public static void main(String[] args) {
        
        int c1=6, c2=5;
        
        System.out.print("Serie 1: ");
        while(c1 < 61){
            if(c1 == 60){
                System.out.println(c1);
            }
            else{
                System.out.print(c1 + ", ");
            }
            c1+=3;
        }
        System.out.print("Serie 2: ");
        do{
            if(c2 == 5000000){
                System.out.println(c2);
            }
            else{
                System.out.print(c2 + ", ");
            } 
            c2*=10;
        }while(c2 < 5000001);
    }
}
