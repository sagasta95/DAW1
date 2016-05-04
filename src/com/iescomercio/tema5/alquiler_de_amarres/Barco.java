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
    private int m_eslora, año_fabricacion, cv, n_camarotes;
    
    
    public Barco(String matricula, int año_fabricacion, int m_eslora, int cv, int n_camarotes){
        this.matricula = matricula;
        this.año_fabricacion = año_fabricacion;
        this.m_eslora = m_eslora;
        this.cv = cv;
        this.n_camarotes = n_camarotes;
    }
    
    public float calcularAlquiler(){
        return (10 * m_eslora);
    }
   
}
