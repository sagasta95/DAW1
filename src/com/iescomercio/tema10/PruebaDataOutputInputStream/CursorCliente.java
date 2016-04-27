/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10.PruebaDataOutputInputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class CursorCliente {
    
    private ArrayList <Cliente> coleccion;
    private File fichero;
    
    public CursorCliente(){
        coleccion = new ArrayList();
        fichero = new File("E:\\Users\\VESPERTINO\\Documents\\NetBeansProjects\\1ª EVA\\data\\clientes.dat");
    }

    public ArrayList<Cliente> getColeccion() {
        return coleccion;
    }
    
    public void cargarFichero(){
        if(fichero.exists()){
///*            DataInputStream fi = new DataInputStream(new FileInputStream(fichero));
//            fi.rea*/
        }
    }
    
    public void reemplazarFichero(){
            DataOutputStream fo = null;
            try {
                fo = new DataOutputStream(new FileOutputStream(fichero));
                for(int c=0; c < coleccion.size(); c++){
                    fo.writeChars(coleccion.get(c).getDni());
                    fo.writeChars(coleccion.get(c).getNombre());
                    fo.writeChars(coleccion.get(c).getApellido1());
                    fo.writeChars(coleccion.get(c).getAplledio2());
                    fo.writeChars(coleccion.get(c).getEdad());
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fo.close();
                } catch (IOException ex) {
                    Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    public void añadir(Cliente c){
        coleccion.add(c);
    }
    
    public void borrar(Cliente c){
        coleccion.remove(c);
    }
}
