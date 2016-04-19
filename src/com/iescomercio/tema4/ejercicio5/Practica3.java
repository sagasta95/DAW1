/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.ejercicio5;

/**
 *
 * @author VESPERTINO
 */
public class Practica3 {
    public static void main(String[] args) {
    
        Taller taller1 = new Taller();
        Coche coche1 = new Coche("opel", "vectra");
        Coche coche2 = new Coche("seat", "leon");
    
        taller1.aceptarCoche(coche1, "fallo de inyeccion");  
        taller1.aceptarCoche(coche2, "fallo de direccion");
        taller1.devolverCoche();
        taller1.devolverCoche();
        System.out.println("El coste acumulado es: " + coche1.getPav());
        taller1.aceptarCoche(coche2, "fallo de la bomba del embrague.");
        taller1.devolverCoche();
        System.out.println("El coste acumulado es: " + coche2.getPav());
        taller1.aceptarCoche(coche1, "aceite");
        taller1.devolverCoche();
        System.out.println("El coste acumulado es: " + coche1.getPav());
        taller1.aceptarCoche(coche2, "Mariposa Izquierda");
        taller1.devolverCoche();
        System.out.println("El coste acumulado es: " + coche2.getPav());
        System.out.println("*********************************");
        System.out.println("Coche 1: \nMarca: " + coche1.getMarca() + "\nModelo: " + coche1.getModelo() + "\nCV: " + coche1.getMotor().getCv() + "\nLitor de aceite: " + coche1.getMotor().getLa() + "\nIngresos totales: " + coche1.getPav());
        System.out.println("*********************************");
        System.out.println("Coche 2: \nMarca: " + coche2.getMarca() + "\nModelo: " + coche2.getModelo() + "\nCV: " + coche2.getMotor().getCv() + "\nLitor de aceite: " + coche2.getMotor().getLa() + "\nIngresos totales: " + coche2.getPav());
    }
}
