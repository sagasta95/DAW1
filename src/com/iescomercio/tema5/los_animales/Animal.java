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
public class Animal {
    private String foto;
    private String tipo_comida;
    private String localizacion;
    private String tamaño;
    
    public void hacerRuido(){
        System.out.println("¡Hace ruido el animal!");
    }
    public void comer(){
        System.out.println("Estoi comiendo.");
    }
    public void dormir(){
        System.out.println("Zzz");
    }
    public void rugir(){
        System.out.println("Ruge el animal");
    }
}
