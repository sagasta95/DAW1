/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.examen;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author VESPERTINO
 */
public class Examen {
    
    private String nombre;
    private ArrayList <Pregunta> preguntas;
    private int numero_preguntas;

    public Examen(String nombre) {
        this.nombre = nombre;
        preguntas = new ArrayList();
    }
    
    public void añadirPregunta(Pregunta p){
        if(!preguntas.contains(p))
            preguntas.add(p);
    }
    
    public Pregunta obtenerPregunta(int indice){
        return preguntas.get(indice);
    }
    
    public void borrarPregunta(int indice){
            preguntas.remove(indice);
    }
    public void moverPregunta(int old, int n){
        Pregunta aux = preguntas.get(old);
    }
    public void mostrar(){
        for (Iterator<Pregunta> iterator = preguntas.iterator(); iterator.hasNext();) {
            Pregunta next = iterator.next();
            System.out.println(next.getEnunciado());
        }
    }
}
