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
public class Titular {
    private String nombre, apellidos;
    private int edad;
    
    public Titular(String pnombre, String papellidos, int pedad){
        nombre = pnombre;
        apellidos = papellidos;
        edad = pedad;
    }
    
    public void setNombre(String pnombre){
        nombre = pnombre;
    }
    public void setApellidos(String papellidos){
        apellidos = papellidos;
    }
    public void setEdad(int pedad){
        edad = pedad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }

    @Override
    public String toString(){
        return "Titular: \nNombre: " + getNombre() + "\nApellidos: " + getApellidos() + "\nEdad: " + getEdad();
    }
}
