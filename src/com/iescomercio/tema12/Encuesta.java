/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author VESPERTINO
 */
public class Encuesta extends JFrame{
    
    private JLabel jlbPregunta, jlbSi, jlbNo;
    private JButton jbtnSi, jbtnNo;
    private JPanel jpSiNo;
    private int si, no;
    private Image icono;
    
    public Encuesta(){
        
        si = 0;
        no = 0;
        icono = new ImageIcon(getClass().getResource("/imagenes/seta.jpg")).getImage();
        jlbPregunta = new JLabel("¿Sabes programar?");
        jlbNo = new JLabel("No: ");
        jlbSi = new JLabel("Si: ");
        jbtnNo = new JButton("No");
        jbtnSi = new JButton("Si");
        jpSiNo = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        jpSiNo.add(jbtnSi);
        jpSiNo.add(jbtnNo);
        
        getContentPane().setLayout(new GridLayout(4, 1, 5, 5));
        getContentPane().add(jlbPregunta);
        getContentPane().add(jpSiNo);
        getContentPane().add(jlbSi);
        getContentPane().add(jlbNo);
        
        
        jbtnSi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               clicSi();
            }
        });
                
        jbtnNo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               clicNo();
            }
        });
        
        pack();
        setTitle("Encuesta");
        setIconImage(icono);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void clicNo(){
        no++;
        jlbSi.setText("Si: " + no);
    }
    private void clicSi(){
        si++;
        jlbNo.setText("No: " + si);
    }
    
    public static void main(String[] args) {
        Encuesta e1 = new Encuesta();
    }
}
