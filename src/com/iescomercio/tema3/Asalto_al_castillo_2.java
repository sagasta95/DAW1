/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *  2-parte
    meter N numeros de personas e ir guardando las combinaciones y grupos
    comprobando que sean positivos y hasta meter n. sin usar un sout.
 * @author VESPERTINO
 */
public class Asalto_al_castillo_2 {
      public static void main(String[] args) {
        int hombres, combinaciones = 1;
        String guarda="";
        Scanner sc = new Scanner(System.in);

        do {
            combinaciones=1;
            System.out.println("Pasame el numero de personas");
            hombres = sc.nextInt();
            while (combinaciones <= hombres) {
                if (hombres % combinaciones == 0) {
                    guarda="\n Grupos de: " +combinaciones+" Personas : "+(hombres / combinaciones)+guarda;
                    
                }
                combinaciones++;
            }
            
        }while (hombres != 0);
          System.out.println(guarda);
    }
}

