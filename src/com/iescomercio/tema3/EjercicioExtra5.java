/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioExtra5 {
    public static void main(String[] args) {
        
        int c1=3, c2=5;
        double r1=1, r2=0;
        
        System.out.print("Serie 1: ");
        while(c1 != 60){
            c1+=3;
            r1 = c1 * r1;
            if(c1 == 60){
                System.out.print(c1);
            }
            else{
                System.out.print(c1 + " * ");  
            }
        }
        System.out.println(" = " + r1);
        System.out.print("Serie 2: ");
        while(c2 != 5000000){
            r2 = c2 + r2;
            c2*=10;
            if(c1 == 5000000){
                System.out.print(c2);
            }
            else{
                System.out.print(c2 + " + ");  
            }
        }
        System.out.println(" = " + r2);
    }
}
