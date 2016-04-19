/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema2;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio6 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n;
        int X;

        System.out.println("Introduce tu edad: ");
        n = sc.nextInt();
        X = n - 10;
        System.out.println("Pues aparentas " + X);
    }
}
