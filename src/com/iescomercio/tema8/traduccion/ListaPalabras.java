/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.traduccion;

import com.iescomercio.mylibrary.Aleatorio;
import java.util.HashMap;

/**
 *
 * @author VESPERTINO
 */
public class ListaPalabras {
    private HashMap <Integer, Palabras> lista;

    public ListaPalabras() {
        lista = new HashMap();
    }
    
    public void añadir(Integer indice, Palabras p){
        lista.put(indice, p);
    }
    
    public Palabras damePalabraAleatoria(){
        int tamaño = lista.values().size();
        int naleatorio = (int) Aleatorio.dameAleatorio(0, tamaño - 1);
        return lista.get(new Integer(naleatorio));
    }
    
}
