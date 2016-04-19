/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.punto;

/**
 *
 * @author VESPERTINO
 */
public class Punto{
    
    public int x, y;
    
    public Punto(int px, int py){
        x = px;
        y = py;
    }
    public Punto(){       
        this(0, 0);
    }
    public Punto(int px){
        this(px, 1);
    }
    
    @Override
    public String toString(){
   
        String aux;
        
        aux = "(" + x + ", " + y + ")";
        return aux;
    }
    @Override
    public boolean equals(Object o){
        
        Punto p = (Punto)o;
        
        if(x == p.x && y == p.y){
            return true;
        }else{
            return false;
        }  
    }
    
    public int equals(){
        
        if(x == y)
            return 0;
        else if(x > y)
            return y;
        else
            return y;
    }
}
