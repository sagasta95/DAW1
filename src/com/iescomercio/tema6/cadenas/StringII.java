/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.cadenas;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class StringII {
    
    public static boolean palindromo(String cadena){
        
        boolean aux = true;
        int longitud = cadena.length()-1;
        
        for(int inicio=0; inicio<longitud; inicio++,longitud--){
            if(cadena.charAt(inicio) != cadena.charAt(longitud))
                aux = false;
        }
       return aux;
    }
    
    public static String reverse (String s){
        String a="";
        for(int i = 0; i < s.length(); i++){
            a = s.charAt(i) + a;
        }
        return a;
    }
    
    public static boolean palindromo2(String cadena){
        boolean aux = true;
        String c1, c2;
        int mitad = (cadena.length()/2);
        int fin = cadena.length();
        c1 = cadena.substring(0, mitad);
        
        if(cadena.length() % 2 == 0)
            c2 = reverse(cadena.substring(mitad, fin));
        else
            c2 = reverse(cadena.substring(mitad+1, fin));
        
        return c1.equals(c2);
    }
    
    public static String contraseña(String cadena){
        String aux, aux1, aux2, aux3, aux4, aux5, aux6, aux7,aux8, aux9;
        
        aux = cadena.replace('A', '@');
        aux1 = aux.replace('a', '@');
        aux2 = aux1.replace('E', '3');
        aux3 = aux2.replace('e', '3');
        aux4 = aux3.replace('I', '1');
        aux5 = aux4.replace('i', '1');
        aux6 = aux5.replace('O', '0');
        aux7 = aux6.replace('o', '0');
        aux8 = aux7.replace("u", "\\/");
        aux9 = aux8.replace("U", "\\/");
        return aux9;
    }
    
    public static void eje5(String cadena){
        
        StringBuilder sb = new StringBuilder(cadena);
        
        System.out.println(sb.charAt(0) + ", " + sb.charAt(1) + ", " + sb.charAt(2));
        

        
        
    }
}
