/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.cafetera;

/**
 *
 * @author VESPERTINO
 */
public class Run_Cafetera {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        System.out.println("Cantidad de cafe: " + cafetera.getCapacidadActual());
        cafetera.llenarCafetera();
        System.out.println("Cantidad de cafe: " + cafetera.getCapacidadActual());
        cafetera.servirTaza(10);
        System.out.println("Cantidad de cafe: " + cafetera.getCapacidadActual());
        cafetera.vaciarCafetera();
        System.out.println("Cantidad de cafe: " + cafetera.getCapacidadActual());
        cafetera.agregarCafe(300);
        System.out.println("Cantidad de cafe: " + cafetera.getCapacidadActual());
        cafetera.servirTaza(250);
        System.out.println("Cantidad de cafe: " + cafetera.getCapacidadActual());
    }
}
