/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.nif;

/**
 *
 * @author VESPERTINO
 */
public class Run_NIF {
    public static void main(String[] args) {
        
       NIF nif1 = new NIF();
        
       nif1.scanDni();
       nif1.mostrar();
    }
}
