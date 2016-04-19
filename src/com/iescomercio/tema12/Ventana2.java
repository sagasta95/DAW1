/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class Ventana2 extends JFrame{
    
    private JButton[] botones;
    private JRadioButton[] botones_sur;
    private JCheckBox[] opciones_este;
    private JLabel[] opciones_oeste;
    private JLabel[] label_centro;
    private JPanel[] paneles_centro;
    private JPanel p1, p2, p3, p4, p5; 
    private JTextField[] cajas_texto;
    
    
    public Ventana2(){
        
        botones = new JButton[10];
        opciones_oeste = new JLabel[10];
        opciones_este = new JCheckBox[7];
        botones_sur = new JRadioButton[3];
        paneles_centro = new JPanel[3];
        cajas_texto = new JTextField[6];
        label_centro = new JLabel[6];
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
               
        this.getContentPane().setLayout(new BorderLayout(5,5));
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.WEST);
        this.add(p3, BorderLayout.EAST);
        this.add(p4, BorderLayout.CENTER);
        this.add(p5, BorderLayout.SOUTH);
        
        p1.setLayout(new FlowLayout());
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));        
        p4.setLayout(new CardLayout());
        p5.setLayout(null);
        
        for (int i = 0; i < 10; i++) {
            botones[i] = new JButton(i + "");
            p1.add(botones[i]);
        }
        
        for (int i = 0; i < 10; i++) {
            opciones_oeste[i] = new JLabel("Opcion" + i);
            p2.add(opciones_oeste[i]);
        }
        
        for (int i = 0; i < 7; i++) {
            opciones_este[i] = new JCheckBox("Opcion" + i);
            p3.add(opciones_este[i]);
        }
        
        botones_sur[0] = new JRadioButton("Opcion 1");
        botones_sur[1] = new JRadioButton("Opcion 2");
        botones_sur[2] = new JRadioButton("Opcion 3");
        p5.add(botones_sur[0]);
        p5.add(botones_sur[1]);
        p5.add(botones_sur[2]);
        p5.setPreferredSize(new Dimension(200, 50));
        botones_sur[0].setBounds(25 , 10 , 100, 15);
        botones_sur[1].setBounds(175 , 10 , 100, 15);
        botones_sur[2].setBounds(325 , 10 , 100, 15);
        
        for (int i = 0; i < 3; i++) {
            paneles_centro[i] = new JPanel(new GridLayout(2, 2));
            p4.add(paneles_centro[i]);
         
        }
        
        for (int i = 0; i < 2; i++) {
            label_centro[i] = new JLabel("Caja " + i);
            cajas_texto[i] = new JTextField();
            paneles_centro[0].add(label_centro[i]);
            paneles_centro[0].add(cajas_texto[i]);
        }
        
        pack();
        setTitle("Ejemplo 2");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ventana2 v2 = new Ventana2();
    }
    
}
