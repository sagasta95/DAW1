/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema2;

/**
 *
 * @author VESPERTINO
 */
public class prubea {
        static boolean unBooleano;
        static byte unByte;
        static short unShort;
        static int unInt;
        static long unLong;
        static float unFloat;
        static double unDouble;
        static char unChar;
        static String unString;
        
    public static void main(String arg[]){

        unChar = '\u06F6';
        System.out.println("el boolean es: " + unBooleano);
        System.out.println("el byte es: " + unByte);
        System.out.println("el short es: " + unShort);
        System.out.println("el int es: " + unInt);
        System.out.println("el long es: " + unLong);
        System.out.println("el float es: " + unFloat);
        System.out.println("el char es: " + unChar);
        System.out.println("el string es: " + unString);
        
        for(int i=0;i<50;i++){
            String hex = Integer.toHexString(i);
            System.out.println("Hex value is " + hex);
        }
        
    }
    
}
