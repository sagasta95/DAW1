/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Los_hermanos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte altura, personas, contador;
        boolean dalton;
        do {
            System.out.println("Pasame la altura");
            altura = sc.nextByte();
            dalton=false;
            if (altura != 0) {
                for (contador = 0; contador < altura; contador++) {
                    System.out.print("Pasame las personas");
                    personas = sc.nextByte();
                    if (personas == altura) {
                        dalton = true;
                    }

                }
                if(dalton==true){
                    System.out.println("Dalton");
                }else{
                    System.out.println("Desconocido");
                }
            }
        }while(altura!=0);
    }
}       