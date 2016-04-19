/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.modificadores_acceso.p1;

/**
 *
 * @author VESPERTINO
 */
public class Main {
    public static void main(String[] args) {
        
        SuperClase sc = new SuperClase();
        SubClase1 sc1 = new SubClase1();
        ClaseSuelta1 cs1 = new ClaseSuelta1();
        
        System.out.println(sc.pub);
        System.out.println(sc.pro);
        System.out.println(sc.pac);
        System.out.println("************");
        System.out.println(sc1.pub);
        System.out.println(sc1.pro);
        System.out.println(sc1.pac);
        System.out.println("************");
        System.out.println(cs1.pub);
        System.out.println(cs1.pro);
        System.out.println(cs1.pac);
        
    }
}
