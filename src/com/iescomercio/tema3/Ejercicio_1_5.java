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
public class Ejercicio_1_5 {
  
    public static void main(String[] args) {
        
        double a, b, c, d, e, f;
        
        a = 7 % 5 + 2 * 3;
        b = 9 / 2 * 2 * 9 / 2;
        c = Math.pow(2 * 3 + (4 * 8 + 4) / 6, 2) + 6;
        d = 118 + 12 -5 * 2 * 10 / 5 % 5;
        e = 3 * Math.pow(2, 4) - 5 * Math.pow(2, 3) + 2 * 12 - 17;
        f = (15 - 4) + 3 - (12 - 5 * 2) + (5 + 16 / 4) - 5 + (10 - Math.pow(2, 3));
        
        System.out.print("7 % 5 + 2 * 3 = " + a + "\n" );
        System.out.print("9 / 2 * 2 * 9 / 2 = " + b + "\n" );
        System.out.print("(2 * 3 + (4 * 8 + 4) / 6) ^ 2 + 6 = " + c + "\n" );
        System.out.print("118 + 12 - 5 * 2 * 10 / 5 % 5 = " + d + "\n" );
        System.out.print("3 * 2 ^ 4 – 5 * 2 ^ 3 + 2 * 12 – 17 = " + e + "\n" );
        System.out.print("(15 - 4) + 3 – (12 – 5 * 2) + (5 + 16 / 4) – 5 + (10 – 2 ^ 3) = " + f + "\n" );
    }
}
