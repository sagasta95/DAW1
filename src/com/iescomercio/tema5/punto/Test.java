/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.punto;

/**
 *
 * @author VESPERTINO
 */
public class Test {
    public static void main(String[] args) {
        
        Punto p1 = new Punto(1, 3);
        Punto p2 = new Punto (3, 8);
        
        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);
        
        if(p1.equals(p2))
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");
        
        System.out.println("Coordenada mayor del punto 1: " + p1.equals());
        System.out.println("Coordenada mayor del punto 2: " + p2.equals());
    }
}
