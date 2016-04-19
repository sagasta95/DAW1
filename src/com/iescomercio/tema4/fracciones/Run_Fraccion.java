/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.fracciones;

/**
 *
 * @author VESPERTINO
 */
public class Run_Fraccion {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(1, 4);
        Fraccion f3;
        
        f3 = f1.suma(f2);
        f3.print();
        f3= f1.resta(f2);
        f3.print();
        f3= f1.mult(f2);
        f3.print();
        f1.setDem(4);
        f1.comparacion(f2);
        f1.setRacional(5, 3);
        f3.copia(f1);
        f3.print();
    }
}
