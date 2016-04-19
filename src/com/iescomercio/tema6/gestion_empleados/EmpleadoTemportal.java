/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.gestion_empleados;

import java.util.GregorianCalendar;

/**
 *
 * @author Ángel
 */
public class EmpleadoTemportal extends Empleado{
     private GregorianCalendar fechaA, fechaB;

    public EmpleadoTemportal(String nif, String nombre, int edad,int Y1, int M1, int D1, int Y2, int M2, int D2) {
        super(nif, nombre, edad);
        this.fechaA = new GregorianCalendar(Y1, M1, D1);
        this.fechaB = new GregorianCalendar(Y2, M2, D2);
    }

     @Override
      public double calculaSueldo(){
       double a=super.calculaSueldo();
       return a;
    }
}
