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
public class Alumno {
    
    private int exp;
    private String nombre;
    private Asignatura a1, a2, a3;
    
    public Alumno(int pexp){
        exp = pexp;
        nombre = null;
        //Asignaturas por defecto
        a1 = new Asignatura(999);
        a2 = new Asignatura(888);
        a3 = new Asignatura(777);
    }
    public Alumno(int pexp, String pnombre){
        exp = pexp;
        nombre = pnombre;
        a1 = new Asignatura(999);
        a2 = new Asignatura(888);
        a3 = new Asignatura(777);
    }
    
    public int getExp(){
        return exp;
    }
    public String getNombre(){
        return nombre;
    }
    public Asignatura getA1(){
        return a1;
    }
    public Asignatura getA2(){
        return a2;
    }
    public Asignatura getA3(){
        return a3;
    }
    public void setNombre(String pnombre){
        nombre = pnombre;
    }
    public void setA1(Asignatura pa1){
        a1 = pa1;
    }
    public void setA2(Asignatura pa2){
        a2 = pa2;
    }
    public void setA3(Asignatura pa3){
        a3 = pa3;
    }
}
