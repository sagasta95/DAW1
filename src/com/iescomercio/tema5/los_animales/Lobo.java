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
public class Lobo extends Canino {
    
    @Override
    public void comer(){
        System.out.println("Estoi comiendo como un lobo.");
    }
    @Override
    public void hacerRuido(){
        System.out.println("¡Auuuuu!");
    }
}
