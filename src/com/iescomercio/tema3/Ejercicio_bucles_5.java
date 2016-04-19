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
public class Ejercicio_bucles_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int cont=8, suma=0, result;
        
        while(cont <= 50){
            suma = suma + cont;
            if(cont < 50){
                System.out.print(cont + " + ");    
            }
            else{
                System.out.print(cont);
            }
            result = suma;
            if(cont == 50){
                System.out.println(" = " + result);
            }
            cont = cont + 2;
        }
    }
}
