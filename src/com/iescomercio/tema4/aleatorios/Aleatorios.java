/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.aleatorios;

/**
 *Clase Aleatorios.
 * Constructor inicial y final
 * Metodo muestraAleatorios que reciba un entero M indicando cantidad de numeros y calcule y muestre por pantalla n numeros entre incial y final.
 * @author VESPERTINO
 */
public class Aleatorios {
    
    private double i, f, n;
    
    public Aleatorios(double pi, double pf){
        i = pi;
        f = pf;
    }

    public void muestraAleatorios(double n){
        
        int cont = 0, x;
        
        while(cont <= n){
            cont++;
            x = (int)(Math.floor(Math.random()*(f - i + 1) + i));
            System.out.println(x);
        }
        
    }
    
    public int dameAleatorio(){
        
        int x;
        
        x = (int)(Math.floor(Math.random()*(f - i + 1) + i));
        return x;
    }
}

