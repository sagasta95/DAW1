/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema7;

import com.iescomercio.mylibrary.MyArray;

/**
 *
 * @author VESPERTINO
 */
public class Arrays {
    
    
    public static void introduccion() {
        
        float nAleatorio[];
        double media;
        nAleatorio = new float[20];
        MyArray.rellenoNumAleatorios(nAleatorio, 0, 10);
        media = MyArray.calculaMedia(nAleatorio);
        System.out.println("La media es: " + media);
    }
    
    public static void ejercicio1(int n, int x, int y){
        
        float nAleatorio[];
        nAleatorio = new float[n];
        MyArray.rellenoNumAleatorios(nAleatorio, x, y);
        System.out.println("Vector: " + MyArray.toString(nAleatorio) + "\nNumero Maximo: " + MyArray.max(nAleatorio) + "\nNumero Minimo: " + MyArray.min(nAleatorio) + "\nMedia: " + MyArray.calculaMedia(nAleatorio));
    }

    //Realizar un programa que calcule y guarde en un array de tamaño 6 con numeros aleatorios de la primitiva(numeros diferentes entre 1 y 49), posteriormente pide 6 numeros al usuario diferentes y finalmente averiguara cuantos numeros a acertado el usuario.
}
