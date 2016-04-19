/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.alumnos;

import com.iescomercio.tema4.alumnos.Alumno;

/**
 *
 * @author Ángel
 */
public class RunAlumno {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setNexp(125);
        System.out.println("numero del expediente: " + alumno1.getNexp());
        alumno1.setCurso(6);
        System.out.println("Numero del curso: " + alumno1.getCurso());
        alumno1.setNombre("Juanito");
        System.out.println("Nombre del alumno: " + alumno1.getNombre());
        alumno1.setPapellido("Romero");
        System.out.println("Primer apellido del alumno: " + alumno1.getPapellido());
        System.out.println("Presentación completa del alumno: " + alumno1.presentate());
    }
}
