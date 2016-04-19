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
public class CuentaCorriente {
    
    private Titular titular;
    private Numero_de_Cuenta nc;
    private double saldo;
    
    public CuentaCorriente(Titular ptitular, Numero_de_Cuenta pnc, double psaldo){
        titular = ptitular;
        nc = pnc;
        saldo = psaldo;
    }
    public CuentaCorriente(Titular ptitular, Numero_de_Cuenta pnc){
        titular = ptitular;
        nc = pnc;
        saldo = 15.3;
    }
    
    public Titular getTitular(){
        return titular;
    }
    public Numero_de_Cuenta getNumero_de_Cuenta(){
        return nc;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double psaldo){
        saldo = psaldo;
    }
    
    public void ingresar(double cantidad){
        saldo = saldo + cantidad;
    }
    public void reintegro(double cantidad){
        saldo = saldo - cantidad;
    }
    public void mostrar(){   
        System.out.println(getNumero_de_Cuenta() + "\nSaldo: " + saldo);
    }
    @Override
    public boolean equals(Object obj) {
        CuentaCorriente c = (CuentaCorriente) obj;
        if(getNumero_de_Cuenta() == c.getNumero_de_Cuenta())
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        return "Datos Cuenta: \n" + getNumero_de_Cuenta() + "\n" + getTitular() + "\nSaldo: " + getSaldo();
    }
}
