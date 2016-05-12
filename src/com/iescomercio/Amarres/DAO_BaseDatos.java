/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.Amarres;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VESPERTINO
 */
public class DAO_BaseDatos implements DAO{

    private Statement stm;
    private ResultSet rs;
    
    public DAO_BaseDatos(){

    }
    
    @Override
    public boolean cargar() {
        try {
            stm = Conexion.getConexion().createStatement();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAO_BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean guardar() {
        try {
            Conexion.getConexion().close();
            stm.close();
            if(rs != null)
                rs.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAO_BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean añadir(Barcos b) {
        try {
            if(stm.executeQuery("select * from barcos where matricula = " + b.getMatricula() + ";").first())
                return false;
            else {
                stm.executeUpdate("insert barcos values(" + b.getMatricula() + "," + b.getAño_fabricacion() + "," + b.getM_eslora() + "," + b.getCv() + "," + b.getN_camarotes() + ");");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean borrar(Barcos b) {
        try {
            if(stm.executeQuery("select * from barcos where matricula = " + b.getMatricula() + ";").first()){
                stm.executeUpdate("delete from barcos where matricula = " + b.getMatricula() + ";");
                return true;
            }
            else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(DAO_BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean modificar1(Barcos b) {
        return borrar(b);
    }
    
    @Override
    public boolean modificar2(Barcos b){
        return añadir(b);
    }

    @Override
    public JTable ver() {
        try {
            String[] titColumna = {"Matricula", "Fabricacion", "Eslora(m)", "CV", "Nº Camarotes"};
            DefaultTableModel modelo = new DefaultTableModel(titColumna, 0);
            rs = stm.executeQuery("select * from barcos");
            while (rs.next()) {
                String[] datColumna = {"" + rs.getInt(1), "" + rs.getInt(2), "" + rs.getInt(3), "" + rs.getInt(4), "" + rs.getInt(5)};
                modelo.addRow(datColumna);
            }
            JTable tabla = new JTable(modelo);
            return tabla;
        } catch (SQLException ex) {
            Logger.getLogger(DAO_BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
