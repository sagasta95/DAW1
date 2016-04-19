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
public class Aleatorio {
    
    public static long dameAleatorio(long i, long f){

        long x;
        
        x = (int)(Math.floor(Math.random()*(f - i + 1) + i));
        return x;
    }
}
