/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10;

import java.io.File;
import java.net.URL;

/**
 *
 * @author VESPERTINO
 */
public class PruebaFile {
    
    public static void main(String[] args) {
        
        fileDat("E:/carpeta/cerdo.png");
        fileDat("E:/carpeta/Game.exe");
        fileDat("E:/carpeta/PackJacket.docx");
    }  
    
    public static void fileDat(String url){
        File f1 = new File(url);
        System.out.println("Nombre: " + f1.getName());
        System.out.println("Nombre: " + f1.getPath());
        System.out.println("Nombre: " + f1.getTotalSpace());
    }
}
