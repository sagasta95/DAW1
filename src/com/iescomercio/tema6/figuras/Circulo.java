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
public class Circulo extends Figura{
    
    private double radio, pi = 3.1416;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        
        area = pi * radio * radio;
        return area;
    }
    @Override
    public double calcularPerimetro(){
        
        perimetro =  2 * pi * radio;
        return perimetro;
    }
}
