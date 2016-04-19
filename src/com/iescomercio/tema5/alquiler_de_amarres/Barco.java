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
public class Barco {
    
    private String matricula;
    private float m_eslora, año_fabricacion;
    
    public Barco(String matricula, int año_fabricacion, int m_eslora){
        this.matricula = matricula;
        this.año_fabricacion = año_fabricacion;
        this.m_eslora = m_eslora;
    }
    
    public float calcularAlquiler(){
        return (10 * m_eslora);
    }
   
}
