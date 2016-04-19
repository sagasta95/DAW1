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
public class Yate extends Deportiva{
    
    private int n_camarotes;

    public Yate(String matricula, int año_fabricacion, int m_eslora, int cv, int n_camarotes) {
        super(matricula, año_fabricacion, m_eslora, cv);
        this.n_camarotes = n_camarotes;
    }
    
    @Override
    public float calcularAlquiler(){
        return super.calcularAlquiler() + n_camarotes * 20;
    }
 
}

