/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.gestion_recordatorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/**
 *
 * @author VESPERTINO
 */
public class Archivador {
    
    private ArrayList <Carpeta> coleccion;
    
    public Archivador(){
        coleccion = new ArrayList();
    }
    
    public boolean añadirCarpeta(Carpeta carpeta){
        if (coleccion.contains(carpeta))
            return false; 
        else 
            coleccion.add(carpeta);
        return true;
    }

    public ArrayList<Carpeta> getColeccion() {
        return coleccion;
    }

    public Carpeta dameCarpeta(String nombre_carpeta) {
        Carpeta aux = new Carpeta(nombre_carpeta);
        int indice =coleccion.indexOf(aux);
        if(indice==-1)
            return null;
        else{  
            return coleccion.get(indice);
        }
    }
    
    public void muestraArrayList() {
        Iterator it = coleccion.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    
}
