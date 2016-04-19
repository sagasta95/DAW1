/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.gestion_recordatorios;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Apunte implements Comparable{
    
    private String asunto, descripcion;
    private GregorianCalendar fecha;

    public Apunte(){
        this.asunto = "";
        this.descripcion = "";
        fecha = new GregorianCalendar();
    }
    
    public Apunte(String asunto, String descripcion) {
        this.asunto = asunto;
        this.descripcion = descripcion;
        fecha = new GregorianCalendar();
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return asunto;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apunte other = (Apunte) obj;
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.asunto);
        return hash;
    }
    
    @Override
    public int compareTo(Object o){
        
        int aux;
        Apunte apunte = (Apunte)o;
        apunte.getFecha().set(GregorianCalendar.HOUR, this.fecha.get(GregorianCalendar.HOUR));
        apunte.getFecha().set(GregorianCalendar.MINUTE, this.fecha.get(GregorianCalendar.MINUTE));
        apunte.getFecha().set(GregorianCalendar.SECOND, this.fecha.get(GregorianCalendar.SECOND));
        aux = apunte.getFecha().compareTo(this.fecha);
        return aux;
    }
    
}
