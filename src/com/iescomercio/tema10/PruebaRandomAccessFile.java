/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class PruebaRandomAccessFile extends JFrame{
    
    private JPanel jpPanel;
    private JLabel jlbOrigen, jlbDestino, jlbTamaño;
    private JTextField jtOrigen, jtDestino, jtTamaño;
    private JFileChooser jfOrigen,jfDestino;
    private JButton jbtnEnviar, jbtnOrigen, jbtnDestino;
    private Dimension d;
    
    public PruebaRandomAccessFile(){
        
        jpPanel = new JPanel(null);
        jlbOrigen = new JLabel("Origen");
        jlbDestino = new JLabel("Destino");
        jlbTamaño = new JLabel("Tamaño");
        jtOrigen = new JTextField();
        jtDestino = new JTextField();
        jtTamaño = new JTextField();
        jfOrigen = new JFileChooser();
        jfDestino = new JFileChooser();
        jbtnEnviar = new JButton("Copiar");
        jbtnOrigen = new JButton("Browse");
        jbtnDestino = new JButton("Browse");
        d = new Dimension(400, 160);
        
        
        this.getContentPane().add(jpPanel);
        this.getContentPane().setSize(d);
        
        jpPanel.add(jlbOrigen);
        jpPanel.add(jlbDestino);
        jpPanel.add(jlbTamaño);
        jpPanel.add(jtOrigen);
        jpPanel.add(jtDestino);
        jpPanel.add(jtTamaño);
        jpPanel.add(jbtnOrigen);
        jpPanel.add(jbtnDestino);
        jpPanel.add(jbtnEnviar);
        
        jlbOrigen.setBounds(20, 20, 100, 20);
        jtOrigen.setBounds(80, 20, 200, 20);
        jbtnOrigen.setBounds(300, 20, 80, 18);
        jlbDestino.setBounds(20, 50, 100, 20);
        jtDestino.setBounds(80, 50, 200, 20);
        jbtnDestino.setBounds(300, 50, 80, 18);
        jbtnEnviar.setBounds(150, 90, 100, 25);
        
        setSize(d);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new PruebaRandomAccessFile();
    }
    
}
