/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10.PruebaDataOutputInputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VESPERTINO
 */
public class CursorCliente {

    private ArrayList<Cliente> coleccion;
    private File fichero;

    public CursorCliente() {
        coleccion = new ArrayList();
        fichero = new File("E:\\Users\\VESPERTINO\\Documents\\NetBeansProjects\\data\\clientes.dat");
    }

    public ArrayList<Cliente> getColeccion() {
        return coleccion;
    }

    public void cargarDatos() {
        if (fichero.exists()) {
            DataInputStream fi = null;
            try {
                fi = new DataInputStream(new FileInputStream(fichero));
                while (true) {
                    añadir(new Cliente(fi.readLong(), fi.readUTF(), fi.readUTF(), fi.readUTF(), fi.readInt()));
                }
            } catch (EOFException ex) {

            } catch (FileNotFoundException ex) {
                Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fi.close();
                } catch (IOException ex) {
                    Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void guardarDatos() {
        DataOutputStream fo = null;
        try {
            fo = new DataOutputStream(new FileOutputStream(fichero));
            for (int c = 0; c < coleccion.size(); c++) {
                fo.writeLong(coleccion.get(c).getDni());
                fo.writeUTF(coleccion.get(c).getNombre());
                fo.writeUTF(coleccion.get(c).getApellido1());
                fo.writeUTF(coleccion.get(c).getAplledio2());
                fo.writeInt(coleccion.get(c).getEdad());
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

    public boolean añadir(Cliente c) {
        if(coleccion.contains(c))
            return false;
        else{
            coleccion.add(c);
            return true;
        }
    }

    public boolean borrar(Cliente c) {
        if (coleccion.contains(c)) {            
            coleccion.remove(c);
            return true;
        } else {
            return false;
        }        
    }

    public JTable consulta() {
        String[] titColumna = {"DNI", "Nombre", "Apellido1", "Apellido2", "Edad"};
        DefaultTableModel modelo = new DefaultTableModel(titColumna, 0);
        for (int c = 0; c < coleccion.size(); c++) {
            String[] datColumna = {"" + coleccion.get(c).getDni(), coleccion.get(c).getNombre(), coleccion.get(c).getApellido1(), coleccion.get(c).getAplledio2(), "" + coleccion.get(c).getEdad()}; 
            modelo.addRow(datColumna);
        }
        JTable tabla = new JTable(modelo);
        return tabla;
    }

    public void modificar() {
        
    }

}
