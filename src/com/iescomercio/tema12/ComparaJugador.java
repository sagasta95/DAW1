/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12;

import java.util.Comparator;

/**
 *
 * @author VESPERTINO
 */
public class ComparaJugador implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Jugador j1 = (Jugador)o1;
        Jugador j2 = (Jugador)o2;
        
        if(j1.getPuntos() > j2.getPuntos())
            return -1;
        else if (j1.getPuntos() < j2.getPuntos())
            return 1;
        else
            return 0;
    }
    
}
