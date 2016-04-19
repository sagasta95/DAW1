/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**Jaime:
25k hombres
puede hacer: 100 batallones de 250 hombres
	     250 btallones de 100 hombres
		otras config hasta 24 distintas.

cada entrada nº+ entre 1 y 500k
 *
 * @author VESPERTINO
 */
public class Asalto_al_castillo {

    public static void main(String[] args) {
        int hombres, combinaciones;
        Scanner sc = new Scanner(System.in);

        do {
            combinaciones=1;
            System.out.println("Pasame el numero de personas");
            hombres = sc.nextInt();
            while (combinaciones <= hombres) {
                if (hombres % combinaciones == 0) {

                    System.out.println("Las combinaciones distintas son de grupos de : " + combinaciones + " personas " + (hombres / combinaciones));
                }
                combinaciones++;
            }
            
        }while (hombres != 0);
    
    }
}