/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.examen;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author VESPERTINO
 */
public class Pregunta_Test_Respuesta_Multiple extends Pregunta_Test{

    public Pregunta_Test_Respuesta_Multiple(String enunciado, String respuesta, int numero_opciones) {
        super(enunciado, respuesta, numero_opciones);
    }
    

    @Override
    public float calculaPuntuacion(String respuesta) {
        
        StringTokenizer st = new StringTokenizer(respuesta);
        ArrayList <String> lista = new ArrayList();
        String aux;
        int aciertos = 0, fallos = 0;
        
        while(st.hasMoreElements()){
            aux = st.nextToken();
            if(aux.indexOf(getRespuesta()) != -1)
                aciertos++;
            else
                fallos++;
        }
        return 0;  
    }
        
    
}
