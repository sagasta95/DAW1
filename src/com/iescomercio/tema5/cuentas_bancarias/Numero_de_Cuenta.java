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
public class Numero_de_Cuenta {
    
    private long ncuenta;
    private int banco, sucursal, dc;
    
    public Numero_de_Cuenta(int pbanco, int psucursal, int pdc, long pncuenta){
        banco = pbanco;
        sucursal = psucursal;
        dc = pdc;
        ncuenta = pncuenta;
    }
    
    public void setBanco(int pbanco){
        banco = pbanco; 
    }
    public void setSucursal(int psucursal){
        sucursal = psucursal;
    }
    public void setDc(int pdc){
        dc = pdc;
    }
    public void setNcuenta(long pncuenta){
        ncuenta = pncuenta;
    }
    public int getBanco(){
        return banco;
    }
    public int getSucursal(){
        
        return sucursal;
    }
    public int getDc(){
        return dc;
    }
    public long getNcuenta(){
        return ncuenta;
    }
    
    @Override
    public String toString(){
        return "Numero de cuenta: " + getBanco() + "-" + getSucursal() + "-" + getDc() + "-" + getNcuenta();
    }
}
