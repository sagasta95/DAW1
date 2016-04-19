/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.alquiler_de_amarres;

import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class Alquiler {
    
    private Cliente cliente;
    private GregorianCalendar f_inicial, f_final;
    private int posicion;
    private Barco barco;
    
    public Alquiler(Cliente cliente, int fi_d, int fi_m, int fi_a, int ff_d, int ff_m, int ff_a, int posicion, Barco barco){
        this.cliente = cliente;
        f_inicial = new GregorianCalendar(fi_a, fi_m, fi_d);
        f_final = new GregorianCalendar(ff_a, ff_m, ff_d);
        this.posicion = posicion;
        this.barco = barco;
    }
    
    public long diferencia_fechas(){
        
        long dif, dif2;
                
        dif = f_final.getTimeInMillis() - f_inicial.getTimeInMillis();
        dif2 = dif / (1000 * 60 * 60 * 24);
        return dif2;
    }
    
    public float calcularAlquiler(){
        return diferencia_fechas() *  barco.calcularAlquiler() + 2;
    }
}
