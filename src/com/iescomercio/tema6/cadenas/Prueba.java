/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.cadenas;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Prueba {
    public static void main(String[] args) {
        
        String cadena;
        Scanner sc = new Scanner(System.in);
    
 /*       System.out.println("Introduce una cadena de caracteres:");
        cadena = sc.nextLine();
        System.out.println(StringII.palindromo2(cadena));
        System.out.println(StringII.contraseña(cadena));
        
        Ejercicio_7.ejercicio13();
        
        Ejercicio_7.ejercicio8(5, 4);*/
        
        System.out.println(Ejercicio_7.ejercicio9(9));
        System.out.println(Ejercicio_7.ejercicio9(0));
        System.out.println(Ejercicio_7.ejercicio9(-2));
    }
}
