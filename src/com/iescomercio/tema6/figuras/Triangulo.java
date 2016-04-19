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
public class Triangulo extends Figura{
    
    private double l1, l2, base, h;
    
    public Triangulo(double l1, double l2, double base, double h){
        this.l1 = l1;
        this.l2 = l2;
        this.base = base;
        this.h = h;
    }
    
    @Override
    public double calcularArea(){
        
        area = (base * h) / 2;
        return area;
    }
    @Override
    public double calcularPerimetro(){
        
        perimetro =  l1 + + l2 + base;
        return perimetro;
    }
}
