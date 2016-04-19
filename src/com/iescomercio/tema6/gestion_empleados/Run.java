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
public class Run {
    public static void main(String[] args) {
        EmpleadoTemportal temporal = new EmpleadoTemportal("72798430A", "Juan", 26, 10, 3, 2015, 26, 12, 2015);
        System.out.println("Sueldo del temporal: "+ temporal.calculaSueldo());
        
        EmpleadoFijo fijo = new EmpleadoFijo(2013, "72798430A", "Roberto", 23);
        System.out.println("Sueldo del fijo: "+ fijo.calculaSueldo());
        
        EmpleadoHoras horas = new EmpleadoHoras(2.15, 13, "72798430A", "Paco", 30);
        System.out.println("Sueldo del horas: "+ horas.calculaSueldo());

    }
}
