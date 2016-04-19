/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.figuras;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(6, 8, 10, 3);
        Circulo circulo = new Circulo(4);
        Matematico aitor = new Matematico();
        
        System.out.println("El perimetro del cuadrado es: " + aitor.averiguarPerimetro(cuadrado));
        System.out.println("El area del cuadrado es: " + aitor.averiguarArea(cuadrado));
        System.out.println("***********************************");
        System.out.println("El perimetro del triangulo es: " + aitor.averiguarPerimetro(triangulo));
        System.out.println("El area del triangulo es: " + aitor.averiguarArea(triangulo));
        System.out.println("***********************************");
        System.out.println("El perimetro del circulo es: " + aitor.averiguarPerimetro(circulo));
        System.out.println("El area del circulo es: " + aitor.averiguarArea(circulo));
        System.out.println("***********************************");
    }
}
