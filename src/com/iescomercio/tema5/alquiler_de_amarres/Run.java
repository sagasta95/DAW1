/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.alquiler_de_amarres;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        
        Cliente aitor = new Cliente(100001, "16636979-K", "Aitor", "Sagastagoitia Saenz");
        
        Barco barco = new Barco("1111-A", 2005, 8);
        Velero velero = new Velero("1112-A", 2010, 9, 1);
        Deportiva deportiva = new Deportiva("1113-A", 2012, 10, 50);
        Yate yate = new Yate("1114-A", 2014, 12, 70, 2);
        
        Alquiler alquiler1 = new Alquiler(aitor, 20, 11, 2015, 24, 11, 2015, 1, barco);
        Alquiler alquiler2 = new Alquiler(aitor, 20, 11, 2015, 24, 11, 2015, 2, velero);
        Alquiler alquiler3 = new Alquiler(aitor, 20, 11, 2015, 24, 11, 2015, 3, deportiva);
        Alquiler alquiler4 = new Alquiler(aitor, 20, 11, 2015, 24, 11, 2015, 4, yate);
        
        System.out.println("Coste de alquiler del Barco: " + alquiler1.calcularAlquiler());
        System.out.println("Coste de alquiler del Velero: " + alquiler2.calcularAlquiler());
        System.out.println("Coste de alquiler de la embarcacion deportiva: " + alquiler3.calcularAlquiler());
        System.out.println("Coste de alquiler del Yate: " + alquiler4.calcularAlquiler());
    }
}
