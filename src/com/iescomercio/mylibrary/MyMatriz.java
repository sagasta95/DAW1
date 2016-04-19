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
public class MyMatriz {
    
    public static void rellenaMatriz2D(char[][] matriz, char dato){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++)
                matriz[i][j] = dato;
        }
    }
        
    
    public static void toString2D(char[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++)
                System.out.print(matriz[i][j] + " ");
        }
    }
}
