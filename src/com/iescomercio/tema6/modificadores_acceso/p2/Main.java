/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.modificadores_acceso.p2;

import com.iescomercio.tema6.modificadores_acceso.p1.ClaseSuelta1;
import com.iescomercio.tema6.modificadores_acceso.p1.SubClase1;
import com.iescomercio.tema6.modificadores_acceso.p1.SuperClase;

/**
 *
 * @author VESPERTINO
 */
public class Main {
        public static void main(String[] args) {
        
        SuperClase sc = new SuperClase();
        SubClase1 sc1 = new SubClase1();
        ClaseSuelta1 cs1 = new ClaseSuelta1();
        SubClase2 sc2 = new SubClase2();
        ClaseSuelta2 cs2 = new ClaseSuelta2();
        
        System.out.println(sc.pub);
        System.out.println("************");
        System.out.println(sc1.pub);
        System.out.println("************");
        System.out.println(cs1.pub);
        System.out.println("************");
        System.out.println(sc2.pub);
        System.out.println("************");
        System.out.println(cs2.pub);
        System.out.println(cs2.pro);
        System.out.println(cs2.pac);
         
    }
}
