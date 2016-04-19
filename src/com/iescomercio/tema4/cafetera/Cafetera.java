/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.cafetera;

/**
 *
 * @author VESPERTINO
 */
public class Cafetera {
    private float capacidadMaxima, capacidadActual;
    
    public Cafetera(){
        capacidadMaxima = 100;
        capacidadActual = 0;
    }
    public Cafetera(float pcapacidadActual){
        capacidadActual = pcapacidadActual;
        capacidadMaxima = capacidadActual;
    }
    public Cafetera(float pcapacidadActual, float pcapacidadMaxima){
        if(pcapacidadActual > pcapacidadMaxima)
            capacidadActual = pcapacidadMaxima;
        else
            capacidadActual = pcapacidadActual;
        capacidadMaxima = pcapacidadMaxima;
    }
    
    public float getCapacidadActual(){
        return capacidadActual;
    }
    public float fetCapacidadMaxima(){
        return capacidadMaxima;
    }
    public void setCapacidadActual(float pcapacidadActual){
        if(pcapacidadActual < capacidadMaxima)
            capacidadActual = pcapacidadActual;
        else
            capacidadActual = capacidadMaxima;
    }
    public void setCapacidadMaxima(float pcapacidadMaxima){
        capacidadMaxima = pcapacidadMaxima;
    }
    
    public void llenarCafetera(){
        capacidadActual = capacidadMaxima;
    }
    public void servirTaza(float x){
        if(capacidadActual > x)
        capacidadActual = capacidadActual - x;
        else{
        System.out.println("La cafetera esta vacia y falta: " + (x - capacidadActual) + " cc de cafe.");
        capacidadActual = 0;
        }
    }
    public void vaciarCafetera(){
        capacidadActual = 0;
    }
    public void agregarCafe(float x){
        float aux = capacidadActual + x;
        if((aux > capacidadMaxima)){
            capacidadActual = capacidadMaxima;
            System.out.println("La cafetera esta llena y han sobrado: " + (aux - capacidadMaxima)); 
        }
        else
            capacidadActual = capacidadActual + x;
    }
}
