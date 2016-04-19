/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.clase_mates;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        
        Mates n1 = new Mates(17);
        
        System.out.println("¿Es perfecto? " + n1.esPerfecto());
        System.out.println("¿Es primo? " + n1.esPrimo());
        n1.listaPerfectos();
    }
}
