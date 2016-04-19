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
public class CuentaAhorro extends CuentaCorriente {
    
    private double interes;
    

    public CuentaAhorro(Titular t, Numero_de_Cuenta nc, double saldo, double interes){
        super(t, nc, saldo);
        this.interes = interes;
    }
    public CuentaAhorro(Titular t, Numero_de_Cuenta nc, double interes){
        this(t, nc, 15.3, interes);
    }
    public CuentaAhorro(Titular t, Numero_de_Cuenta nc){
        this(t, nc, 15.3, 2.5);
    }
    
    public double getInteres(){
        return interes;
    }
    
    public void calcularInteres(){
        ingresar(getSaldo() * (interes / 100));
    }
}
