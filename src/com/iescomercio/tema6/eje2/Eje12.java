/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.eje2;

/**
 *
 * @author VESPERTINO
 */
public class Eje12 {
    
    public static void ejercicio12(String a, String b){
        
        StringBuilder sb = new StringBuilder();
        
        
        for(int n = 0; n < 10; n++){
            
            for(int c2 = 0; c2 < a.length(); c2++){
                if(Character.getNumericValue(a.charAt(c2))== n)
                    sb.append(a.charAt(c2));
                
            }

            for(int c3 = 0; c3 < b.length(); c3++){
                if(Character.getNumericValue(b.charAt(c3))== n)
                    sb.append(b.charAt(c3));
                
            }
            
        }
        System.out.println("Cadena 1: " + a + "\nCadena 2: " + b + "\nUnion Ordenada: " + sb);
    }
    
    public static void ejercicio12_2(String a, String b){
    
        StringBuilder sb = new StringBuilder();
        
        for(int c = 0; c < (a.length()); c++){
            
            int c1 = 0, c2 = 0;
            
            if(Character.getNumericValue(a.charAt(c1)) == Character.getNumericValue(b.charAt(c2))){
                sb.append(a.charAt(c1));
                sb.append(b.charAt(c2));
                c1++;
                c2++;
            }
            else if (Character.getNumericValue(a.charAt(c1)) > Character.getNumericValue(b.charAt(c2))){
                sb.append(b.charAt(c2));
                c2++;
            }

            else{
                sb.append(a.charAt(c1));
                c1++;
            }

            
        }
        System.out.println("Cadena ordenada 1: " + a + "\nCadena ordenada 2: " + b + "\nCadena unida:" + sb);
        
}
    
    public static void main(String[] args) {
        Eje12.ejercicio12("1124443213435", "21321321434566");
        System.out.println("***************************");
        Eje12.ejercicio12_2("11444677","226688999");
    }
}
