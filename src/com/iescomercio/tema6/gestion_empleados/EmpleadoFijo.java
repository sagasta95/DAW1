/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.gestion_empleados;

import java.util.Calendar;

/**
 *
 * @author Ángel
 */
public class EmpleadoFijo extends Empleado {

    private int anoAlta;
    private int year = Calendar.getInstance().get(Calendar.YEAR);

    public EmpleadoFijo(int anoAlta, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.anoAlta = anoAlta;
    }
    
      @Override
      public double calculaSueldo(){
       double a=super.calculaSueldo()+ (20*(year-anoAlta));
       return a;
    }
}
