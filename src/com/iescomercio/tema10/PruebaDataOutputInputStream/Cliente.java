/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10.PruebaDataOutputInputStream;

import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Cliente {
    
    private String nombre, apellido1, aplledio2;
    private long dni;
    private int edad;
    
    public Cliente(long dni, String nombre, String apellido1, String apellido2, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.aplledio2 = apellido2;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getAplledio2() {
        return aplledio2;
    }

    public void setAplledio2(String aplledio2) {
        this.aplledio2 = aplledio2;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
}
