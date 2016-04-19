/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.examen;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        Examen e = new Examen("PRG");
        Pregunta_Test p1 = new Pregunta_Test("enunciado\na.1\nb.2", "b", 2);
        e.añadirPregunta(p1);
        e.mostrar();
            
    }

}
