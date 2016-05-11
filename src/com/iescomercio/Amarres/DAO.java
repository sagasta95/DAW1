/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.Amarres;

import javax.swing.JTable;

/**
 *
 * @author VESPERTINO
 */
public interface DAO {
    
    public boolean cargar();
    
    public boolean guardar();
    
    public boolean añadir(Barcos b);
    
    public boolean borrar(Barcos b);
    
    public boolean modificar1(Barcos b);
    
    public boolean modificar2(Barcos b);
    
    public JTable ver();
}
