/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.el_instituto_2;

/**
 *
 * @author VESPERTINO
 */
public class Practica7 {
    public static void main(String[] args) {
        Asignatura prog = new Asignatura(001);
        Asignatura bases = new Asignatura(002);
        Asignatura sistemas = new Asignatura(003);
        Alumno aitor = new Alumno(00001, "Aitor Sagastagoitia Saenz");
        Profesor david = new Profesor();
        
        aitor.setA1(prog);
        aitor.setA2(bases);
        aitor.setA3(sistemas);
        
        david.ponerNotas(aitor);
        david.calcularMedia(aitor);
        
        System.out.println("Alumno: " + aitor.getNombre() + "\nProgramacion: " + aitor.getA1().getCalificacion() + "\nBases de datos: " + aitor.getA2().getCalificacion() + "\nSistemas Informaticos: " + aitor.getA3().getCalificacion() + "\nMedia: " + david.calcularMedia(aitor));
    }
}
