/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author VESPERTINO
 */
public class Calculadora extends JFrame implements ActionListener{
    
    private JButton[] botones;
    private JPanel[] paneles;
    private JLabel jlbresultado;
    private Image icono;
    private int op1, resultado;
    private char operador;
    
    public Calculadora(){
        
        botones = new JButton[17];
        paneles = new JPanel[3];
        icono = new ImageIcon(getClass().getResource("/imagenes/calcuworld.png")).getImage();
        jlbresultado = new JLabel(" ");
        
        for (int i = 0; i < 3; i++) {
            paneles[i] = new JPanel();
        }
        
        for (int i = 0; i < 10; i++) {
                botones[i] = new JButton("" + i);
        }      
        botones[10] = new JButton("+");         
        botones[11] = new JButton("-");
        botones[12] = new JButton("=");
        botones[13] = new JButton("C");
        botones[14] = new JButton("*");
        botones[15] = new JButton("/");
        botones[16] = new JButton("%");

        for (int i = 0; i < 17; i++) {
            botones[i].addActionListener(this);
        }

        paneles[0].setLayout(new FlowLayout(FlowLayout.RIGHT));
        paneles[0].add(jlbresultado);
        
        paneles[1].setLayout(new GridLayout(5, 3));
        for (int i = 0; i < 12; i++) {
            paneles[1].add(botones[i]);
        }
        paneles[1].add(botones[14]);
        paneles[1].add(botones[15]);
        paneles[1].add(botones[16]);
        
        paneles[2].setLayout(new GridLayout(1, 2));
        paneles[2].add(botones[12]);
        paneles[2].add(botones[13]);
        
        getContentPane().setLayout(new BorderLayout());
        add(paneles[1], BorderLayout.CENTER);
        add(paneles[2], BorderLayout.SOUTH);
        add(paneles[0], BorderLayout.NORTH);
        
        setResizable(false);
        setMinimumSize(new Dimension(200, 200));
        setIconImage(icono);
        setVisible(true);//hacer visible la ventana
        setLocationRelativeTo(null);//para que la ventana salga centrada
        setTitle("Calculadora");//titulo de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para terminar proceso al cerrar ventana
        pack();//para que los botones se adaptel al tamaño de la ventana
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            JButton bot = (JButton) e.getSource();
            switch (bot.getText()) {
                case "+":
                    // Ha sido pulsado el +
                    op1 = Integer.parseInt(jlbresultado.getText());
                    operador = '+';
                    jlbresultado.setText(" ");
                    break;
                case "-":
                    // Ha sido pulsado el -
                    op1 = Integer.parseInt(jlbresultado.getText());
                    operador = '-';
                    jlbresultado.setText(" ");
                    break;
                case "*":
                    // Ha sido pulsado el -
                    op1 = Integer.parseInt(jlbresultado.getText());
                    operador = '*';
                    jlbresultado.setText(" ");
                    break;
                case "/":
                    // Ha sido pulsado el -
                    op1 = Integer.parseInt(jlbresultado.getText());
                    operador = '/';
                    jlbresultado.setText(" ");
                    break;
                case "%":
                    // Ha sido pulsado el -
                    op1 = Integer.parseInt(jlbresultado.getText());
                    operador = '%';
                    jlbresultado.setText(" ");
                    break;
                case "=":
                    // Ha sido pulsado el =
                    switch(operador){
                        case '+': 
                            resultado = op1 + Integer.parseInt(jlbresultado.getText().trim());
                            jlbresultado.setText("" + resultado);
                            break;
                        case'-': 
                            resultado = op1 - Integer.parseInt(jlbresultado.getText().trim());
                            jlbresultado.setText("" + resultado);
                            break;
                        case'*':
                            resultado = op1 * Integer.parseInt(jlbresultado.getText().trim());
                            jlbresultado.setText("" + resultado);
                            break;
                        case '/':
                            resultado = op1 / Integer.parseInt(jlbresultado.getText().trim());
                            jlbresultado.setText("" + resultado);
                            break;
                        case '%':
                            resultado = op1 % Integer.parseInt(jlbresultado.getText().trim());
                            jlbresultado.setText("" + resultado);
                            break;
                    }  
                    break;
                case "C":
                    op1 = 0;
                    jlbresultado.setText(" ");
                    break;
                default:
                    jlbresultado.setText(jlbresultado.getText().trim() + bot.getText());
                    break;
            }
        } catch (Exception ex){
             jlbresultado.setText("Error");
        }
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
    }
}
