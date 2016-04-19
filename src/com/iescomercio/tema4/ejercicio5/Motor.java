/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.ejercicio5;

/**
 *
 * @author VESPERTINO
 */
public class Motor {
    
    private int la, cv;
    
    public Motor(int pcv){
        la = 25;
        cv = pcv;
    }
    
    public int getLa(){
        return la;
    }
    public int getCv(){
        return cv;
    }
    
    public void setLa(int pla){
        la = pla;
    }
}
