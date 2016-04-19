/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.cuentas_bancarias;

/**
 *
 * @author VESPERTINO
 */
public class Test {
    public static void main(String[] args) {
        
        Titular aitor = new Titular("Aitor", "Sagastagoitia Saenz", 20);
        Numero_de_Cuenta nc_aitor = new Numero_de_Cuenta(1001, 1001, 10, 10000001);
        CuentaCorriente cc_aitor = new CuentaCorriente(aitor, nc_aitor, 1000);
        CuentaAhorro ca_aitor = new CuentaAhorro(aitor, nc_aitor, 1000, 2.5);
        
        
        System.out.println(aitor.toString());
        System.out.println("*****************************");
        System.out.println(nc_aitor.toString());
        System.out.println("*****************************");
        System.out.println(cc_aitor.toString());
        System.out.println("*****************************");
        cc_aitor.ingresar(1500);
        cc_aitor.reintegro(150);
        cc_aitor.mostrar();
        System.out.println("*****************************");
        if(cc_aitor.equals(cc_aitor))
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");
        System.out.println("*****************************");
        ca_aitor.calcularInteres();
        ca_aitor.mostrar();
        
    }
}
