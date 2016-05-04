/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10.PruebaObjectOutputInputStream;

import javax.swing.JTable;

/**
 *
 * @author VESPERTINO
 */
public interface DAO {
    
    public boolean cargar();
    
    public boolean guardar();
    
    public boolean añadir(Barco b);
    
    public boolean borrar(Barco b);
    
    public boolean modificar();
    
    public JTable ver();
}
