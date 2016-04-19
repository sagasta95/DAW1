/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.gestion_empleados;

/**
 *
 * @author Ángel
 */
public class Empleado {
    private String nif, nombre;
    private int edad;

    public Empleado(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public double calculaSueldo(){
        double a=580;
        return a;
    }
    
}
