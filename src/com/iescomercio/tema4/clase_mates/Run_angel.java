/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.clase_mates;

/**
 *
 * @author Ángel
 */
public class Run_angel {

    public static void main(String[] args) {
        Mates_angel numero = new Mates_angel(6);
        Mates_angel numero2 = new Mates_angel(11);
        Mates_angel numero3 = new Mates_angel(30);
        System.out.println("---------------------------");
        System.out.println("Numero 6 es perfecto?: " + numero.esPerfecto());
        System.out.println("Numero 11 es perfecto?: " + numero2.esPerfecto());
        System.out.println("---------------------------");
        System.out.println("Numero 15 es primo?: " + numero.esPrimo());
        System.out.println("Numero 11 es primo?: " + numero2.esPrimo());
        System.out.println("---------------------------");
        numero3.listaPerfectos();
        System.out.println("---------------------------");
        System.out.println("La suma de cifras del numero 11 es : "+ numero2.sumaCifras());
        System.out.println("---------------------------");
        System.out.println("El numero de divisores del numero 30 es: "+ numero3.numDivisores());
        System.out.println("---------------------------");
        System.out.println("El numero 30 en binario es: "+ numero3.base2());
    }
}
