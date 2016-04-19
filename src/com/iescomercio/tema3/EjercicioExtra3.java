/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *Mostrar un programa que muestre la tabla del 5 hasta 500, empezando por el cien.
 * @author VESPERTINO
 */
public class EjercicioExtra3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x=100, c=15;
        
        while(x < 500){
            c = c + 5;
            x = c * 5;
            System.out.println("5 x " + c + " = " + x);
        }
    }
}
