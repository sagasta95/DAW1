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
public class Los_Dalton {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, c = 1, altura, ultima_altura = 0, diferencia=0;
        boolean dalton = false;
        
        
        
        System.out.print("Introduce el numero de personajes de la viñeta: ");
        n = sc.nextInt();
        
        if(n > 1){
            while(n >= c){
                System.out.print("Introduce la altura del personaje " + c + ": ");
                altura = sc.nextInt();
                
                if(c == 2){
                    if(altura > ultima_altura){
                        diferencia = altura - ultima_altura;
                        dalton = true;
                    }
                    else
                        dalton = false;
                }
                if(c > 2){
                    if((dalton == true)&&(diferencia == altura - ultima_altura))
                        dalton = true;
                    else
                        dalton = false;
                }
                if(c == n){
                    if(dalton == true)
                        System.out.println("Son Dalton");
                    else
                        System.out.println("No son dalton");
                }
                ultima_altura = altura;
                c++;
            }
        }
        else{
            System.out.println("La viñeta no tiene los personajes necesarios.");
        }
    }
    
}
