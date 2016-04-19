/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.examen;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author VESPERTINO
 */
public class Pregunta_Test extends Pregunta{
    
    private int numero_opciones;

    public Pregunta_Test(String enunciado, String respuesta, int numero_opciones) {
        super(enunciado, respuesta);
        this.numero_opciones = numero_opciones;
    }

    @Override
    public Collection opcionesValidas() {
        
        ArrayList <String> lista = new ArrayList();
        
        for (int i = 0; i < numero_opciones; i++) {
            lista.add("" + (char)('a' + i));
        }
        return lista;
    }

    @Override
    public float calculaPuntuacion(String respuesta) {
        if(getRespuesta().equals(respuesta))
            return 1;
        else
            return 1 / numero_opciones;
            
    }
    
}
