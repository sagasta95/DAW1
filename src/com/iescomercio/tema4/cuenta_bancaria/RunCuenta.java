/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.cuenta_bancaria;

/**
 *
 * @author VESPERTINO
 */
public class RunCuenta {
    public static void main(String[] args) {
        Cuenta cuentaAngel;     //declaracion
        cuentaAngel = new Cuenta(700.0);    //Instanciacion
        
        System.out.println("El saldo es: " + cuentaAngel.dameSaldo());
        cuentaAngel.reintegro(150.5);
        System.out.println("El saldo es: " + cuentaAngel.dameSaldo());
        cuentaAngel.ingresar(855.5);
        System.out.println("El saldo es: " + cuentaAngel.dameSaldo());
        cuentaAngel.reintegro(1500.5);
        System.out.println("El saldo es: " + cuentaAngel.dameSaldo());
    }
}
