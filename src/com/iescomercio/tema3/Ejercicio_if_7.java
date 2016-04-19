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
public class Ejercicio_if_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        float a, b, c;
        
        System.out.print("Introduce un numero entero positivo: ");
        a = sc.nextFloat();
        System.out.print("Introduce un segundo numero entero positivo: ");
        b = sc.nextFloat();
        System.out.print("Introduce un tercer numero entero positivo: ");
        c = sc.nextFloat();
        
        if(a > 0 && b > 0 && c > 0){
            if(a != b && a != c && b != c){
                if(a > b){
                    if(b > c){
                        System.out.print("Ordenacion Descendente: " + a + ", " + b + ", " + c);
                    }
                    else{
                        if(c > a){
                            System.out.print("Ordenacion Descendente: " + c + ", " + a + ", " + b);
                        }
                        else{
                            System.out.print("Ordenacion Descendente: " + a + ", " + c + ", " + b);
                        }
                    }
                }
                else{
                    if(a > c){
                        System.out.print("Ordenacion Descendente: " + b + ", " + a + ", " + c);
                    }
                    else{
                        if(b > c){
                            System.out.print("Ordenacion Descendente: " + b + ", " + c + ", " + a);
                        }
                        else{
                            System.out.print("Ordenacion Descendente: " + c + ", " + b + ", " + a);
                        }
                    }
                }
            }
            else{
                System.out.println("Algunos numero son iguales.");
            }
        }
        else{
            System.out.println("Algun numero introducido no es Entero Positivo");
        }
    }
}
