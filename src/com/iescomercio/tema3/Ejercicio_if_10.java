/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *&& ((m % 2 == 0) && ((d < 31) && (d > 0)) || (m % 2 != 0) && (d)
 * @author VESPERTINO
 */
public class Ejercicio_if_10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int d, m, a;
        
        System.out.print("Introduce el dia: ");
        d = sc.nextInt();
        System.out.print("Introduce el mes: ");
        m = sc.nextInt();
        System.out.print("Introduce el año: ");
        a = sc.nextInt();
        
        if(a > 0){
            if((m < 13) && (m > 0)){
                if((d < 31) && (m % 2 == 0)){
                    
                }
            }
            else{
                System.out.println("La fecha no es correcta.");
            }
        }
        else{
            System.out.println("La fecha no es correcta.");
        }       
    }
}
