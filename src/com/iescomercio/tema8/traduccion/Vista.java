/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.traduccion;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Vista {
    
    public void juego(ListaPalabras lp){
        
        Scanner sc = new Scanner(System.in);
        String ingles, frances;
        Marcador m = new Marcador();
        int aux=0;
        
        while(true){
            Palabras p = lp.damePalabraAleatoria();
            System.out.println("La palabra " + p.getEspañol() + " se escribe en:");
            System.out.print("Ingles: ");
            ingles = sc.nextLine();
            System.out.print("\nFrances: ");
            frances = sc.nextLine();

            if(ingles.equals(p.getIngles()))
                aux++;
            if(frances.equals(p.getFrances()))
                aux++;
            m.ponAcierto(aux);
            System.out.println(m);
        }
    }   
    
}
