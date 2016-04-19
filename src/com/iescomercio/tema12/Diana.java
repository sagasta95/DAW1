/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12;

import com.iescomercio.tema5.punto.Punto;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;


/**
 *
 * @author VESPERTINO
 */
public class Diana extends JFrame implements MouseListener{

    private JLabel jlbdiana, jlbdardo, jlbdardo2, jlbpuntos, jlbpuntos2;
    private final JPanel jpnmarcador;
    private ImageIcon imgdiana, imgdardo, imgdardo2;
    private int acumulador, acumulador2, c1, c2;
    private final Punto pcentro;
    
    public Diana(){
        URL url = getClass().getResource("/imagenes/diana.jpg");
        URL url2 = getClass().getResource("/imagenes/dardo.png");
        URL url3 = getClass().getResource("/imagenes/dardo2.png");
        imgdardo = new ImageIcon(url2);
        imgdiana = new ImageIcon(url);
        imgdardo2 = new ImageIcon(url3);
        jpnmarcador = new JPanel(new FlowLayout());
        jlbdiana = new JLabel(imgdiana);
        jlbpuntos = new JLabel("Jugador 1 | Puntos: " + 0);
        jlbpuntos2 = new JLabel(" || Jugador 2 | Puntos: " + 0);
        pcentro = new Punto(311, 295);
        acumulador = 0;
        acumulador2 = 0;
        c1=0;
        c2=0;
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(jpnmarcador, BorderLayout.SOUTH);
        jpnmarcador.add(jlbpuntos);
        jpnmarcador.add(jlbpuntos2);
        this.getContentPane().add(jlbdiana, BorderLayout.CENTER);
        
        jlbdiana.addMouseListener(this);
        
        setMinimumSize(new Dimension(imgdiana.getIconWidth(), imgdiana.getIconHeight()+15));
        setVisible(true);//hacer visible la ventana
        setResizable(false);
        setLocationRelativeTo(null);//para que la ventana salga centrada
        setTitle("Diana");//titulo de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para terminar proceso al cerrar ventana
    }
    
    private double distanciaPuntos(Punto p1, Punto pcentro){
        double cateto1 = p1.x - pcentro.x;
        double cateto2 = p1.y - pcentro.y;
        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        return hipotenusa;
    }
    
    private void fin(){
        if (c1 == 3 && c2 == 3){
            if(acumulador > acumulador2)
                jlbpuntos.setText("!GANA EL JUGADOR1¡");
            else if (acumulador == acumulador2){
                jlbpuntos.setText("¡EMPATE!");
            }
            else{
                jlbpuntos.setText("¡GANA EL JUGADOR2!");
            }
            jlbpuntos2.setText("");
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
            if(e.isMetaDown()){//si es true es boton derecho
                if(c1 < 3){
                    jlbdardo = new JLabel(imgdardo);
                    this.getContentPane().add(jlbdardo, BorderLayout.CENTER);
                    this.setComponentZOrder(jlbdardo, 0);
                    jlbdardo.setBounds(e.getX()-35, e.getY()-12, imgdardo.getIconHeight(), imgdardo.getIconWidth());

                    Punto p1 = new Punto(e.getX(), e.getY());
                    acumulador2 = acumulador2 + (300 - (int)distanciaPuntos(p1, pcentro));
                    jlbpuntos2.setText(" || Jugador 2 | Puntos: " + acumulador2);
                    c1++;
                }
            }
            else{//false el contrario
                if(c2 < 3){
                    jlbdardo2 = new JLabel(imgdardo2);
                    this.getContentPane().add(jlbdardo2, BorderLayout.CENTER);
                    this.setComponentZOrder(jlbdardo2, 0);
                    jlbdardo2.setBounds(e.getX()-35, e.getY()-12, imgdardo.getIconHeight(), imgdardo.getIconWidth());

                    Punto p1 = new Punto(e.getX(), e.getY());
                    acumulador = acumulador + (300 - (int)distanciaPuntos(p1, pcentro));
                    jlbpuntos.setText("Jugador 1 | Puntos: " + acumulador);
                    c2++;
                }
            }
            fin();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    public static void main(String[] args) {
        new Diana();
    }
}
