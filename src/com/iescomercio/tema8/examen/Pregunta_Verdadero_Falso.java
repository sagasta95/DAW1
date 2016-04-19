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
public class Pregunta_Verdadero_Falso extends Pregunta{

    public Pregunta_Verdadero_Falso(String enunciado, String respuesta) {
        super(enunciado, respuesta);
    }

    @Override
    public Collection opcionesValidas() {
        
        ArrayList <String> lista = new ArrayList();
        lista.add("Verdadero");
        lista.add("Falso");
        
        return lista;
    }

    @Override
    public float calculaPuntuacion(String respuesta) {
        if(getRespuesta().equals(respuesta))
            return 1;
        else
            return -1;
    }
    
}
