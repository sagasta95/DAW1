/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.los_animales;

/**
 *
 * @author VESPERTINO
 */
public class Run_Los_animales {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Canino canino = new Canino();
        Lobo lobo = new Lobo();
        
        animal.comer();
        animal.dormir();
        animal.hacerRuido();
        animal.rugir();
        System.out.println("***************");
        canino.comer();
        canino.dormir();
        canino.hacerRuido();
        canino.rugir();
        System.out.println("**************");
        lobo.comer();
        lobo.dormir();
        lobo.hacerRuido();
        lobo.rugir();
        
    }
}
