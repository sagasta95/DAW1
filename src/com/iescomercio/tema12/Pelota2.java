package com.iescomercio.tema12;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Serializable;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Pelota2 extends JFrame implements Runnable, KeyListener, ActionListener{

    private JPanel jpPanel, jpMarcador, jpTop;
    private JLabel jlbPelota, jlbBarra, jlbFin, jlbPuntos, jlbCorazon1, jlbCorazon2, jlbCorazon3, jlbFondo, jlbGameOver, jlbTexto, jlbFondo2, jlbTop, jlbTop2;
    private JButton jbtnEnviar, jbtnNewGame;
    private URL urlPelota, urlBarra, urlFin, urlCorazon, urlFondo, urlFondo2;
    private Dimension d;
    private ImageIcon imagenPelota, imagenBarra, imagenFin, imagenCorazon, imagenFondo, imagenFondo2;
    private JTextField txt1;
    private ArrayList <Jugador> coleccion;
    private File fichero;
    private int puntos, vidas;
    private boolean c;
    private int velocidad;

    public Pelota2() {
        fichero = new File("E:/Users/VESPERTINO/Documents/NetBeansProjects/data/top.obj");
        urlPelota = getClass().getResource("/imagenes/cerdo.png");
        urlBarra = getClass().getResource("/imagenes/barra.png");
        urlFin = getClass().getResource("/imagenes/game-over.png");
        urlCorazon = getClass().getResource("/imagenes/1up.png");
        urlFondo = getClass().getResource("/imagenes/fondo.png");
        urlFondo2 = getClass().getResource("/imagenes/fondo2.png");
        imagenFondo = new ImageIcon(urlFondo);
        imagenBarra = new ImageIcon(urlBarra);
        imagenPelota = new ImageIcon(urlPelota);
        imagenFin = new ImageIcon(urlFin);
        imagenCorazon = new ImageIcon(urlCorazon);
        imagenFondo2 = new ImageIcon(urlFondo2);
        d = new Dimension(1090, 700);
        c = true;
        vidas = 2;
        puntos = 0;
        velocidad = 2;

        jpPanel = new JPanel();
             
        jlbPuntos = new JLabel("Puntos: " + puntos);
        jlbBarra = new JLabel(imagenBarra);
        jlbPelota = new JLabel(imagenPelota);
        jlbPuntos.setForeground(Color.BLACK);
        jlbCorazon1 = new JLabel(imagenCorazon);
        jlbCorazon2 = new JLabel(imagenCorazon);
        jlbCorazon3 = new JLabel(imagenCorazon);
        jlbFondo = new JLabel(imagenFondo);


        getContentPane().add(jpPanel);
        getContentPane().setSize(d);

        jpPanel.setLayout(null);
        jpPanel.setFocusable(true); // Al arrancar la app 
        jpPanel.setSize(d);
        jpPanel.addKeyListener(this);
        
        jpPanel.add(jlbFondo);
        jpPanel.add(jlbPelota);
        jpPanel.add(jlbBarra);
        jpPanel.add(jlbPuntos);
        jpPanel.add(jlbCorazon1);
        jpPanel.add(jlbCorazon2);
        jpPanel.add(jlbCorazon3);
        jlbFondo.setBounds(0, 0, imagenFondo.getIconWidth(), imagenFondo.getIconHeight());
        jpPanel.setComponentZOrder(jlbFondo, 6);
        jlbPelota.setBounds(1, 1, imagenPelota.getIconWidth(), imagenPelota.getIconHeight());
        jlbBarra.setBounds((d.getSize().width / 2 - imagenBarra.getIconWidth() / 2), d.getSize().height - 80, imagenBarra.getIconWidth(), imagenBarra.getIconHeight());
        jlbPuntos.setBounds(1, imagenCorazon.getIconHeight() + 2, 100, 20);
        jlbCorazon1.setBounds(1, 1, imagenCorazon.getIconWidth(), imagenCorazon.getIconHeight());
        jlbCorazon2.setBounds(imagenCorazon.getIconWidth() + 2, 1, imagenCorazon.getIconWidth(), imagenCorazon.getIconHeight());
        jlbCorazon3.setBounds(2 *imagenCorazon.getIconWidth() + 2, 1, imagenCorazon.getIconWidth(), imagenCorazon.getIconHeight());
        

        setSize(d);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Pelota2 a = new  Pelota2();
        Thread t = new Thread(a);
        t.start();
    }

    @Override
    public void run() {
        int auxX = -1;
        int auxY = -1;
        while(c){
            try {
                if(jlbPelota.getLocation().x <= 0)
                    auxX = +1;
                if(jlbPelota.getLocation().x >= d.getSize().width - (jlbPelota.getSize().width))
                    auxX = -1;
                if(jlbPelota.getLocation().y <=0)
                    auxY = +1;
                if(((jlbPelota.getLocation().y + jlbPelota.getSize().height) == jlbBarra.getLocation().y + 40) && (jlbPelota.getLocation().x + ((jlbPelota.getSize().width / 2)) > jlbBarra.getLocation().x) && (jlbPelota.getLocation().x + ((jlbPelota.getSize().width / 2)) < (jlbBarra.getLocation().x + jlbBarra.getSize().width))){
                    auxY = -1;
                }
                if(jlbPelota.getLocation().y >= d.getSize().height - (jlbPelota.getSize().height)){
                    switch(vidas){
                        case 2:
                            vidas--;
                            jpPanel.remove(jlbCorazon3);
                            jlbPelota.setBounds(1, 1, imagenPelota.getIconWidth(), imagenPelota.getIconHeight());
                            break;
                        case 1:
                            vidas--;
                            jpPanel.remove(jlbCorazon2);
                            jlbPelota.setBounds(1, 1, imagenPelota.getIconWidth(), imagenPelota.getIconHeight());
                            break;
                        case 0:              
                            jpPanel.remove(jlbCorazon1);

                            jpPanel.remove(jlbPelota);
                            jpPanel.remove(jlbBarra);
                            
                            jlbFin = new JLabel();
                            jlbGameOver = new JLabel(imagenFin);
                            jpMarcador = new JPanel();
                            jlbFondo2 = new JLabel(imagenFondo2);
                            
                            jpPanel.add(jlbFin);
                            jlbFin.setBounds(0, 0, d.width, d.height);
                            
                            txt1 = new JTextField();
                            jlbTexto = new JLabel("Introduce tu nombre:");
                            jbtnEnviar = new JButton("Enviar");
                            
                            
                            jpTop = new JPanel(null);
                            

                           
                            if(fichero.exists()){
                                ObjectInputStream f = new ObjectInputStream(new FileInputStream(fichero));
                                ArrayList aux = (ArrayList)f.readObject();
                                f.close();
                                Collections.sort(aux, new ComparaJugador());
                                Iterator it = aux.iterator();
                                int i = 0;
                                int c = 1;
                                while(it.hasNext()){
                                    Jugador j = (Jugador)it.next();
                                    jlbTop =  new JLabel(c + ". " + j.getNombre());
                                    jlbTop2 = new JLabel("" + j.getPuntos());
                                    jpTop.add(jlbTop);
                                    jpTop.add(jlbTop2);
                                    jlbTop.setBounds(10, 2 + i, 100, 20);
                                    jlbTop2.setBounds(240, 2 + i, 100, 20);
                                    i = i + 22;
                                    c++;
                                }
                            }

                            
                            
                            jbtnNewGame = new JButton("Nueva Partida");
                            
                                                             
                            jlbFin.add(jlbGameOver);
                            jlbFin.add(jpMarcador); 
                            
                            jlbGameOver.setBounds(d.width / 2 - imagenFin.getIconWidth() / 2, d.height / 2 - imagenFin.getIconHeight() / 2, imagenFin.getIconWidth(), imagenFin.getIconHeight());
                            jpMarcador.setBounds(800, 0, 290, 700);
                            
                            jpMarcador.add(jlbFondo2);  
                            
                            
                            jpMarcador.add(jlbTexto);
                            jpMarcador.add(txt1);
                            jpMarcador.add(jbtnEnviar);
                            jpMarcador.add(jpTop);
                            jpMarcador.add(jbtnNewGame);
                            
                            jbtnEnviar.addActionListener(this);
                            jbtnNewGame.addActionListener(this);
                            
                            jlbFondo2.setBounds(0, 0, 290, 700);
                            jpMarcador.setComponentZOrder(jlbFondo2, 5);
                            jpMarcador.setComponentZOrder(jpTop, 0);
                            jlbTexto.setBounds(20, 25, 125, 50);
                            txt1.setBounds(162, 38, 100, 25);
                            jbtnEnviar.setBounds(jpMarcador.getSize().width / 2 - 50, 85, 100, 25);
                            jpTop.setBounds(0, 400, jpMarcador.getSize().width, 222);
                            jpTop.setBackground(new Color(226, 196, 168));
                            jbtnNewGame.setBounds(jpMarcador.getSize().width / 2 - 100, 660, 200, 25);
                            
                            
                            this.setComponentZOrder(jlbFin, 0);
  
                            c = false;
                            repaint();
                            break;
                    }
                }
                    
                jlbPelota.setLocation((jlbPelota.getLocation().x + auxX), jlbPelota.getLocation().y + auxY);
                sleep(velocidad);
                puntos = puntos + 1;
                jlbPuntos.setText("Puntos: " + puntos);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pelota2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Pelota2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pelota2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (c){
            if (key == KeyEvent.VK_LEFT)
                if(jlbBarra.getLocation().x > 0)
                    jlbBarra.setLocation((jlbBarra.getLocation().x - 15), jlbBarra.getLocation().y);
                
            
            if (key == KeyEvent.VK_RIGHT) 
                if(jlbBarra.getLocation().x < (jpPanel.getSize().width - jlbBarra.getSize().width))
                    jlbBarra.setLocation((jlbBarra.getLocation().x + 15), jlbBarra.getLocation().y);
            }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ObjectInputStream fi = null;
        ObjectOutputStream fo = null;

            JButton bot = (JButton) e.getSource();

            switch (bot.getText()) {
                case "Enviar":            
                    Jugador j = new Jugador(txt1.getText(), puntos);
                    if(fichero.exists()){
                        try {
                            fi = new ObjectInputStream(new FileInputStream(fichero));
                            ArrayList al = (ArrayList)fi.readObject();
                            al.add(j);
                            fichero.delete();
                            fo = new ObjectOutputStream(new FileOutputStream(fichero));
                            fo.writeObject(al);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Pelota2.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(Pelota2.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Pelota2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            coleccion = new ArrayList();
                            coleccion.add(j);
                            fo = new ObjectOutputStream(new FileOutputStream(fichero));
                            fo.writeObject(coleccion);
                            fo.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Pelota2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    jpMarcador.remove(jlbTexto);
                    jpMarcador.remove(jbtnEnviar);
                    jpMarcador.remove(txt1);
                    repaint();
                    break;
                case "Nueva Partida":

                    break;
            }
    }
}
