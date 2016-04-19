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
public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        area = lado * lado;
        return area;
    }   
    @Override
    public double calcularPerimetro(){
        perimetro = lado * 4;
        return perimetro;
    }
}
