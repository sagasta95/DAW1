/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.cadenas;

import com.iescomercio.tema4.aleatorios.Aleatorios;
import static java.lang.System.nanoTime;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio_7 {
    
    public static boolean mismoTamaño(String s1, String s2){
        if(s1.length()!= s2.length()){
            System.out.println("El tamaaño de ser el mismo");
            return false;
        }
        return true;
    }
    
    public static boolean llenoDeNumerosEnterosPositivosYCero(String s1){
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) < '0' || s1.charAt(i) > '9' ) {
                System.out.println("Las cadenas deben tener numeros enteros +");
                return false;
            }
        }
        return true;
    }
    
    public static boolean compruebaMultiplo(String s1, int multiplo){
        if(s1.length() % multiplo != 0 ){
            System.out.println("El String no es multiplo de " + multiplo);
            return false;
        }
        return true;
    }
    
    public static String ejercicio7(String s1, String s2){
        
        StringBuilder sr = new StringBuilder("");
        
        if(!mismoTamaño(s1,s2) || !llenoDeNumerosEnterosPositivosYCero(s1) || !llenoDeNumerosEnterosPositivosYCero(s2) || !compruebaMultiplo(s1, 3) || !compruebaMultiplo(s2, 3)){
            System.out.println("Las cadenas recibidas no son las adecuadas.");
            return null;
        }
        for(int i = 0; i < s1.length(); i+=3){
            sr.append(s1.substring(i, i+3));
            sr.append(s2.substring(i, i+3));
        }
        return sr.toString();
    }
    
    public static void ejercicio13(){
        
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();
        long t1, t2,t3;
        
        t1 = nanoTime();
        for(int c = 0;  c <=1000000; c++){
            sb1.append("hola");
        }
        t2 = nanoTime();
        for(int c2 = 0;  c2 <=1000000; c2++){
            sb2.append("hola");
        }
        t3 = nanoTime();
        System.out.println("Tiempo pStringBuilder: " + (t2 - t1));
        System.out.println("Tiempo StringBuffer: " + (t3 - t2));
        
    }
    
    public static void ejercicio8(int n, int m, int tam){
        
        StringBuilder destino = new StringBuilder();
        StringBuilder aleatorio = new StringBuilder();
        Aleatorios a1 = new Aleatorios(0,9);
        
        // Comnprobar entradas
        
        
        
        for(int i = 0; i < tam; i++){
            aleatorio.append(a1.dameAleatorio());
        }
        
        for(int i = 0; i < tam;  i++){
            destino.append(aleatorio.charAt(i));
            if(i == m){
                for(int i2 = 0; i2 < n; i2++){
                    destino.append("*");
                }
            }
        }
        System.out.println(destino);
    }
    
    public static String ejercicio9(int n){
        
        StringBuilder sb = new StringBuilder("0123456789");
        StringBuilder sb2 = new StringBuilder();
        
        
        if(n < 0 || n > 9){
            System.out.println("El numero introducido no es un numero natural distinto de 0.");
            return null;
        }
        
        for(int i = 0; i < sb.length(); i++){
            sb2.append(sb.charAt(i));
            if(Character.getNumericValue(sb.charAt(i)) == n)
                sb2.append(n);
        }
        return sb2.toString();
    }
}
