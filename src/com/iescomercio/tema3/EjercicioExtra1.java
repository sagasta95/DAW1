/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
/*
 Realizar un programa en java, que pida al usuario el radio de un circulo y calcule
 y muestre por pantalla el area y el perimetro de dicho circulo.
 */

public class EjercicioExtra1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float radio;
        float area; 
        float perimetro;

        System.out.print("Introduce un radio: ");
        radio = sc.nextFloat();
        
        perimetro = (float)(2 * 3.14 * radio);
        area = (float)(3.14 * radio * radio);
        
        System.out.printf("El radio " + radio + " dibuja una circunferencia de Perimetro: %.4f y Area %.4f\n", perimetro, area);
    }
}
