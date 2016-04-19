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
public class Velero extends Barco{
    
    private int n_mastiles;
    
    public Velero(String matricula, int año_fabricacion, int m_eslora, int n_mastiles){
        super(matricula, año_fabricacion, m_eslora);
        this.n_mastiles = n_mastiles;
    }
    
    @Override
    public float calcularAlquiler(){
        return super.calcularAlquiler() + (n_mastiles * 5);
    }
}
