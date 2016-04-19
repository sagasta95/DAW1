/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.ejercicio5;

/**
 *
 * @author VESPERTINO
 */
public class Coche {
    
    private Motor motor;
    private String marca, modelo;
    private double pav;
    
    public Coche(String pmarca, String pmodelo){
        motor = new Motor(90);
        marca = pmarca;
        modelo = pmodelo;
        pav = 0;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    
    public double getPav(){
        return pav;
    }
    public Motor getMotor(){
        return motor;
    }
    
    public void acumularAveria(double ppav){
        pav = pav + ppav;
    }
}
