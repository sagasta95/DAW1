/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema2;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioExtra1 {
        public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        String n;
        String a;
        int tf;
        int e;

        System.out.println("Introduce tu nombre: ");
        n = sc.nextLine();
        System.out.println("Introduce tus apellidos: ");
        a = sc.nextLine();
        System.out.println("Introduce tu telefono: ");
        tf = sc.nextInt();
        System.out.println("Introduce tu edad: ");
        e = sc.nextInt();
        System.out.println("*********************"); 
        System.out.println("* Nombre: " + n);
        System.out.println("* Apellidos: " + a );
        System.out.println("* Tfno: " + tf );
        System.out.println("* Edad: " + e );
        System.out.println("*********************");
        }
}
