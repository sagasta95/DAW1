/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.Amarres;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Conexion {
    private File f;
    private BufferedReader br;
    private String driver, bd, user, pw, port, host, url;
    private static Connection con;
    
    private Conexion(){
        String[] linea2;
        try {
            f = new File("E:\\Users\\VESPERTINO\\Documents\\NetBeansProjects\\cfg\\cfg.ini");
            br = new BufferedReader(new FileReader(f));
            String linea = br.readLine();
            while(linea != null){
                linea2 = linea.split("=");
                switch(linea2[0]){
                    case "driver":
                        driver = linea2[1];
                        break;
                    case "user":
                        user = linea2[1];
                        break;
                    case "pw":
                        if(linea2.length == 1)
                            pw = "";
                        else
                            pw = linea2[1];
                        break;
                    case "host":
                        host = linea2[1];
                        break;
                    case "port":
                        port = linea2[1];
                        break;
                    case "bd":
                        bd = linea2[1];
                        break;
                }
                linea = br.readLine();
            }
            Class.forName(driver);
            url = "jdbc:" + bd + "://" + host + ":" + port + "/mysql?zeroDateTimeBehavior=convertToNull";
            con = DriverManager.getConnection(url, user, pw);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static Connection getConexion(){
        if(con == null) {
           new Conexion();
        }
        return con;
    }
}
