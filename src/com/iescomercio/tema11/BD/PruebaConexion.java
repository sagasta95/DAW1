/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema11.BD;

import com.iescomercio.Amarres.Conexion;
import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class PruebaConexion {
    
    private Statement stm;
    private ResultSet rs;
    
    public PruebaConexion(){
        try {
            stm = Conexion.getConexion().createStatement();
            stm.executeUpdate("delete from barcos.barcos where matricula = ;");
//            while(rs.next()){
//                System.out.println(rs.getInt(4));
//            }
        } catch (SQLException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        PruebaConexion pruebaConexion = new PruebaConexion();
    }
}