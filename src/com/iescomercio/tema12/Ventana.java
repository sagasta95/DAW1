/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class Ventana extends JFrame {
    
    private javax.swing.JButton[] botones;
    
    public Ventana(){
        
        botones = new JButton[5];
        
        this.getContentPane().setLayout(new BorderLayout(5, 5));

        botones[0] = new JButton("norte");
        botones[1] = new JButton("sur");
        botones[2] = new JButton("este");
        botones[3] = new JButton("oeste");
        botones[4] = new JButton("centro");
        
        this.add (botones[0],BorderLayout.NORTH);
        this.add (botones[1],BorderLayout.SOUTH);
        this.add (botones[2],BorderLayout.EAST);
        this.add (botones[3],BorderLayout.WEST);
        this.add (botones[4],BorderLayout.CENTER);
        
        pack();
        setTitle("Ejemplo Border Layout");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
}
