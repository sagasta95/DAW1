/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio_bucles_7 {
    public static void main(String[] args) {
        
        int c=1;
        long mult=1;
        
        do{
            c = c * 2;            
            if((c != 128) && (c != 512)){
                mult = c * mult;
                if(c == 1024){
                    System.out.print(c); 
                }
                else{
                    System.out.print(c + " x "); 
                } 
            }
            
        }while(c != 1024);
        
/*      while(c != 1024){
            c = c * 2;
            if((c != 128) && (c != 512)){
            mult = c * mult;
                if(c == 1024){
                    System.out.print(c); 
                }
                else{
                    System.out.print(c + " x "); 
                } 
            }
        }*/
        System.out.println(" = " + mult);
    }
}
