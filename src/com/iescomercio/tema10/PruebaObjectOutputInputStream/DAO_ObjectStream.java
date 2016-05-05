/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10.PruebaObjectOutputInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VESPERTINO
 */
public class DAO_ObjectStream implements DAO{

    private ArrayList <Barco> coleccion;
    private File fichero;
    
    public DAO_ObjectStream() {
        coleccion = new ArrayList();
        fichero = new File("E:\\Users\\VESPERTINO\\Documents\\NetBeansProjects\\data\\barcos.dat");
    }
    
    @Override
    public boolean cargar() {
        if (fichero.exists()) {
            ObjectInputStream fi = null;
            try {
                fi  = new ObjectInputStream(new FileInputStream(fichero));
                coleccion = (ArrayList)fi.readObject();
            } catch (IOException ex) {
                Logger.getLogger(DAO_ObjectStream.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DAO_ObjectStream.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fi.close();
                } catch (IOException ex) {
                    Logger.getLogger(DAO_ObjectStream.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return true;
            }
            return false;
    }

    @Override
    public boolean guardar() {
        ObjectOutputStream fo = null;
        try {
            fo = new ObjectOutputStream(new FileOutputStream(fichero));
            fichero.delete();
            fo.writeObject(coleccion);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAO_ObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAO_ObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                try {
                    fo.close();
                } catch (IOException ex) {
                    Logger.getLogger(DAO_ObjectStream.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return true;
    }

    @Override
    public boolean añadir(Barco b) {
        if(coleccion.contains(b))
            return false;
        else{
            coleccion.add(b);
            return true;
        }
    }

    @Override
    public boolean borrar(Barco b) {
        if (coleccion.contains(b)) {            
            coleccion.remove(b);
            return true;
        } else {
            return false;
        } 
    }

    @Override
    public boolean modificar() {
        return true;
    }

    @Override
    public JTable ver() {
        String[] titColumna = {"Matricula", "Fabricacion", "Eslora(m)", "CV", "Nº Camarotes"};
        DefaultTableModel modelo = new DefaultTableModel(titColumna, 0);
        for (int c = 0; c < coleccion.size(); c++) {
            String[] datColumna = {coleccion.get(c).getMatricula(), "" + coleccion.get(c).getAño_fabricacion(), "" + coleccion.get(c).getM_eslora(), "" + coleccion.get(c).getCv(), "" + coleccion.get(c).getN_camarotes()}; 
            modelo.addRow(datColumna);
        }
        JTable tabla = new JTable(modelo);
        return tabla;
    }
    
}
