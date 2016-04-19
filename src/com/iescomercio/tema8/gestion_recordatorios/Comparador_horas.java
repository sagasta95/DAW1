/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.gestion_recordatorios;

import java.util.Comparator;
import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class Comparador_horas implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2){
        int aux;
        Apunte ap1 = (Apunte) o1;
        Apunte ap2 = (Apunte) o2;
        ap1.getFecha().set(GregorianCalendar.YEAR, ap2.getFecha().get(GregorianCalendar.YEAR));
        ap1.getFecha().set(GregorianCalendar.MONTH, ap2.getFecha().get(GregorianCalendar.MONTH));       
        ap1.getFecha().set(GregorianCalendar.DAY_OF_MONTH, ap2.getFecha().get(GregorianCalendar.DAY_OF_MONTH));
        aux = ap1.compareTo(ap2);
        return aux;
    }
    
}
