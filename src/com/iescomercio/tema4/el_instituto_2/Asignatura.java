/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.el_instituto_2;

/**
 *
 * @author VESPERTINO
 */
public class Asignatura {
    
    private int id;
    private double calificacion;
    
    public Asignatura(int pid){
        id = pid;
        calificacion = 0;
    }
    
    public int getId(){
        return id;
    }
    public double getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(double pcalificacion){
        calificacion = pcalificacion;
    }
}
