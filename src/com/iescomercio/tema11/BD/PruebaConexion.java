/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema11.BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class PruebaConexion {
    
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public PruebaConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull", "root", "");
            stm = con.createStatement();
            rs = stm.executeQuery("select * from negocios2011.pedidoscabe");
            while(rs.next()){
                System.out.println(rs.getString(4));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        PruebaConexion pruebaConexion = new PruebaConexion();
    }
}