/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.mylibrary;

/**
 *
 * @author VESPERTINO
 */
public class MyString {
    
    public static StringBuilder stringNumAleatorios(StringBuilder sb, int n){
        
        for(int c = 0; c < n; c++){
            sb.append(Aleatorio.dameAleatorio(0, 9));
        }
        
        return sb;
    }
    
    public static double stringNumSuma(StringBuilder sb){
        
        double suma = 0;
        
        for(int c = 0; c < sb.length(); c++){
            suma = Character.getNumericValue(sb.charAt(c)) + suma;
        }
        return suma;
    }
    
    public static double stringNumMedia(StringBuilder sb){

        double media, suma;
        
        suma = MyString.stringNumSuma(sb);
        media = suma / sb.length() - 1;
  
        return media;
    }
}
