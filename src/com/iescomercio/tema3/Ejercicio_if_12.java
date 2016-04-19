/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *12.	Realizar un programa en Java que pida un número entero entre 1 y 12
 * y calcule y muestre por pantalla el mes correspondiente (no es posible utilizar switch)
 * @author Ángel
 */
public class Ejercicio_if_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        do{
        System.out.println("Pasame el numero del mes:  ");
        a = sc.nextInt();
        if (a<1 || a>12)
         System.out.println("El numero debe estar en el rango 1 - 12");
        }while(a<1 || a>12);
            if(a==1){
                System.out.println("Enero");
            }
            else if(a==2){
                System.out.println("Febrero");
            }
            else if(a==3){
                System.out.println("Marzo");
            }
              else if(a==4){
                System.out.println("Abril");
            }
              else if(a==5){
                System.out.println("Mayo");
            }
              else if(a==6){
                System.out.println("Junio");
            }
              else if(a==7){
                System.out.println("Julio");
            }
              else if(a==8){
                System.out.println("Agosto");
            }
              else if(a==9){
                System.out.println("Septiembre");
            }
              else if(a==10){
                System.out.println("Octubre");
            }
              else if(a==11){
                System.out.println("Noviembre");
            }
              else{
                  System.out.println("Diciembre");
              }
       }
}

