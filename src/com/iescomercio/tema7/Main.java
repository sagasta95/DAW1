/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema7;

import com.iescomercio.mylibrary.MyArray;

/**
 *
 * 
 * @author VESPERTINO
 */
public class Main {
    public static void main(String[] args) {
        
        Arrays.introduccion();
        System.out.println("*************************");
        Arrays.ejercicio1(10, 2, 9);
        System.out.println("*************************");
        float datos[];
        datos = new float[50];
            MyArray.rellenoNumAleatorios(datos, 0, 1000);
        System.out.println(MyArray.toString(datos));
        System.out.println(MyArray.toString(MyArray.ordenarArray(datos)));
        
    }
}
