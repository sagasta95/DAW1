/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.traduccion;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        ListaPalabras l = new ListaPalabras();
        Palabras p1 = new Palabras("coche", "car", "voiture");
        Palabras p2 = new Palabras("casa", "house", "maison");
        Palabras p3 = new Palabras("jardin", "garden", "jardin");
        Vista v = new Vista();
        
        l.añadir(0, p1);
        l.añadir(1, p2);
        l.añadir(2, p3);
        v.juego(l);
    }
}
