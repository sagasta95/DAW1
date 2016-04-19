/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.cuenta_bancaria;

/**
 *  primera prueba POO
 * @author VESPERTINO
 */
public class Cuenta {
    //Attributos
    double saldo;
    
    //Contructores
    public Cuenta(){
        saldo = 0;
    }   
    public Cuenta(double x){
        saldo = x;
    }
    
    //Metodos
    public void ingresar (double pasta){ //void porque no quiero que devuelva nada
        saldo =saldo + pasta;
    }
    
    public boolean reintegro (double pastaSacar){
        if (saldo >= pastaSacar){
            saldo = saldo-pastaSacar;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public double dameSaldo (){
        return saldo;
    }
}

/**
 *  Declaracion  
 * Cuenta aCuenta;
 * 
 * Instanciarlo
 * cAngel = new Cuenta (500);
 * 
 */