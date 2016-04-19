/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.gestion_recordatorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Carpeta {
    
    private String nombre;
    private ArrayList <Apunte> coleccion;

    public Carpeta(){
        this.nombre = "";
        coleccion = new ArrayList();
    }
    
    public Carpeta(String nombre) {
        this.nombre = nombre;
        coleccion = new ArrayList();
    }
    
    public void añadirApunte(Apunte apunte){
        coleccion.add(apunte);
    }
    
    public boolean borrarApunte(String asunto){
        Apunte aux = new Apunte(asunto, "");
        if(coleccion.indexOf(aux)==-1)
            return false;
        else{
            coleccion.remove(coleccion.indexOf(aux));
            return true;
        }
    }
    
    public boolean verApunte(String asunto){
        Apunte aux = new Apunte(asunto, "");
        if(coleccion.indexOf(aux)==-1)
            return false;
        else{
            coleccion.get(coleccion.indexOf(aux));
            return true;
        }
    }
    
    public boolean modificarApunte(String asunto, Apunte nuevo){
        Apunte aux = new Apunte(asunto, "");
        int indice = coleccion.indexOf(aux);
        if(indice==-1)
            return false;
        else{
            coleccion.set(indice, nuevo);
            return true;
        }
    }
    
    public void listadoNatural(){
        Collections.sort(coleccion);
        muestraArrayList();
    }

    public void listadoHoras(){
        Comparador_horas ch = new Comparador_horas();
        Collections.sort(coleccion, ch);
        muestraArrayList();
    }
    
    private void muestraArrayList() {
        Iterator it = coleccion.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carpeta other = (Carpeta) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return nombre;
    }
}
