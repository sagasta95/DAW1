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
public class EmpleadoHoras extends Empleado{
    private double precioHora;
    private int horasMes;

    public EmpleadoHoras(double precioHora, int horasMes, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.precioHora = precioHora;
        this.horasMes = horasMes;
    }
    
      @Override
      public double calculaSueldo(){
       double a=super.calculaSueldo()+ (precioHora* horasMes);
       return a;
    }
    
}
