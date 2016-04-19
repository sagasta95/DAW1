/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 *
 * @author VESPERTINO
 */
//Realizar un programa en java, en el que se declare u na variable de tipo entero, 
//inicializada con el valor 878953, y que muestre y saque por pantalla ese numero en decimal,
//en octal y en hexadecimal; y sacar nombre edad y sueldo con printf
public class Prueba_Printf {   
    public static void main(String[] args) {
    
    int x = 878953;
    String n ="Aitor";
    byte e = 20;
    float s = (float)1102.83;
        
    System.out.printf("El numero " + x + " codificado en:\n\nDecimal: %d\n" + "Octal: %o\n" + "Hexadecimal: %x\n", x, x, x);
    System.out.printf("\nDatos presonales:\n\nNombre: %s\n" + "Edad: %d\n" + "Sueldo: %.2f\n", n, e, s);
    }
}
