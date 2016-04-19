/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.alquiler_de_amarres;

/**
 *
 * @author VESPERTINO
 */
public class Deportiva extends Barco{
    
    private int cv;
    
    public Deportiva(String matricula, int año_fabricacion, int m_eslora, int cv){
        super(matricula, año_fabricacion, m_eslora);
        this.cv = cv;
    }
    
    @Override
    public float calcularAlquiler(){
        return super.calcularAlquiler() + cv;
    }
}
