/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.Tema3Bucles;
import java.util.Scanner;
/**
 *11.	Pedir un número y calcular su factorial
 * @author Ángel
 */
public class Ejercicio_bucles_11 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Pasame un numero:  ");
        a = sc.nextInt();
        for(b=1; a>0; a--){
            b=b*a;
        }
        System.out.println("El resultado del factorial es: "+ b);
    }
}
