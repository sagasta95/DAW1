package com.iescomercio.tema12;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AngryBirdsArcade extends JFrame implements Runnable, KeyListener, ActionListener{

    private JPanel jpPanel, jpMarcador, jpTop, jpPause;
    private JLabel jlbPelota, jlbBarra, jlbFin, jlbPuntos, jlbCorazon1, jlbCorazon2, jlbCorazon3, jlbFondo, jlbGameOver, jlbTexto, jlbFondo2, jlbTop, jlbTop2, jlbPause, jlbLogo;
    private JButton jbtnEnviar, jbtnNewGame, jbtnReanudar, jbtnReiniciar, jbtnTop, jbtnCerrar;
    private URL urlPelota, urlBarra, urlFin, urlCorazon, urlFondo, urlFondo2, urlIcon, urlPause;
    private Dimension d;
    private ImageIcon imagenPelota, imagenBarra, imagenFin, imagenCorazon, imagenFondo, imagenFondo2, imagenPause;
    private Image imagenIcono;
    private JTextField txt1;
    private ArrayList <Jugador> coleccion;
    private File fichero;
    private int puntos, vidas;
    private boolean c, pause;
    private int velocidad;

    public AngryBirdsArcade() {
        fichero = new File("marcador/top.obj");
        urlPelota = getClass().getResource("/imagenes/cerdo.png");
        urlBarra = getClass().getResource("/imagenes/barra.png");
        urlFin = getClass().getResource("/imagenes/game-over.png");
        urlCorazon = getClass().getResource("/imagenes/1up.png");
        urlFondo = getClass().getResource("/imagenes/fondo.png");
        urlFondo2 = getClass().getResource("/imagenes/fondo2.png");
        urlIcon = getClass().getResource("/imagenes/icon.png");
        imagenFondo = new ImageIcon(urlFondo);
        imagenBarra = new ImageIcon(urlBarra);
        imagenPelota = new ImageIcon(urlPelota);
        imagenFin = new ImageIcon(urlFin);
        imagenCorazon = new ImageIcon(urlCorazon);
        imagenFondo2 = new ImageIcon(urlFondo2);
        imagenIcono = new ImageIcon(urlIcon).getImage();
        d = new Dimension(1090, 700);
        c = true;
        vidas = 2;
        puntos = 0;
        velocidad = 1;
        pause = false;
        jpPanel = new JPanel();
        jlbPuntos = new JLabel("Puntos: " + puntos);
        jlbBarra = new JLabel(imagenBarra);
        jlbPelota = new JLabel(imagenPelota);
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
        jlbPuntos.setForeground(Color.BLACK);
        

        setSize(d);
        setResizable(false);
        setIconImage(imagenIcono);
        setTitle("Angry Birds Arcade");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void pause(){   
        if(pause == false){
            pause = true;
            
            jlbPause = new JLabel();
            jbtnReanudar = new JButton("Reanudar");
            jbtnReiniciar = new JButton("Reiniciar");
            jbtnTop = new JButton("Top 10");
            jbtnCerrar = new JButton("Cerrar");
            urlPause = getClass().getResource("/imagenes/logo.png");
            imagenPause = new ImageIcon(urlPause);
            jlbLogo = new JLabel(imagenPause);
            
            jpPanel.add(jlbPause);
            jlbPause.add(jbtnReanudar);
            jlbPause.add(jbtnReiniciar);
            jlbPause.add(jbtnTop);
            jlbPause.add(jbtnCerrar);
            jlbPause.add(jlbLogo);
            
            jbtnReanudar.addActionListener(this);
            jbtnReiniciar.addActionListener(this);
            jbtnTop.addActionListener(this);
            jbtnCerrar.addActionListener(this);

            jlbPause.setBounds(0,0,1090,700);
            jbtnReanudar.setBounds(300, 350, 100, 25);
            jbtnReiniciar.setBounds(425, 350, 100,25);
            jbtnTop.setBounds(550, 350, 100, 25);
            jbtnCerrar.setBounds(675,350,100,25);
            jlbLogo.setBounds(d.width / 2 - imagenPause.getIconWidth() / 2, 50, imagenPause.getIconWidth(), imagenPause.getIconHeight());
            jpPanel.setComponentZOrder(jlbPause, 0);
        }
        else{
            pause = false;
            jlbPause.setVisible(pause);
        } 
    }
     
    private void gameOver(){
        jlbFin = new JLabel();
        jlbGameOver = new JLabel(imagenFin);
        jpMarcador = new JPanel();
        jlbFondo2 = new JLabel(imagenFondo2);
        txt1 = new JTextField();
        jlbTexto = new JLabel("Introduce tu nombre:");
        jbtnEnviar = new JButton("Enviar");
        jpTop = new JPanel(null);
        jbtnNewGame = new JButton("Nueva Partida");

        jpPanel.add(jlbFin);
        jlbFin.add(jlbGameOver);
        jlbFin.add(jpMarcador); 
        jpMarcador.add(jlbFondo2);  
        jpMarcador.add(jlbTexto);
        jpMarcador.add(txt1);
        jpMarcador.add(jbtnEnviar);
        jpMarcador.add(jpTop);
        jpMarcador.add(jbtnNewGame);

        jlbFin.setBounds(0, 0, d.width, d.height);
        jlbGameOver.setBounds(d.width / 2 - imagenFin.getIconWidth() / 2, d.height / 2 - imagenFin.getIconHeight() / 2, imagenFin.getIconWidth(), imagenFin.getIconHeight());
        jpMarcador.setBounds(800, 0, 290, 700);
        jlbFondo2.setBounds(0, 0, 290, 700);
        jpMarcador.setComponentZOrder(jlbFondo2, 5);
        jpMarcador.setComponentZOrder(jpTop, 0);
        jlbTexto.setBounds(20, 25, 125, 50);
        txt1.setBounds(162, 38, 100, 25);
        jbtnEnviar.setBounds(jpMarcador.getSize().width / 2 - 50, 85, 100, 25);
        jpTop.setBounds(0, 400, jpMarcador.getSize().width, 222);
        jpTop.setBackground(new Color(226, 196, 168));
        jbtnNewGame.setBounds(jpMarcador.getSize().width / 2 - 100, 660, 200, 25);

        jbtnEnviar.addActionListener(this);
        jbtnNewGame.addActionListener(this);
        jpPanel.remove(jlbPelota);
        jpPanel.remove(jlbBarra);
        this.setComponentZOrder(jlbFin, 0);
        mostrarTop();
        c = false;
        repaint();
    }
    
    private void mostrarTop(){
        if(fichero.exists()){
            ObjectInputStream f = null;
            try {
                jpTop.removeAll();
                f = new ObjectInputStream(new FileInputStream(fichero));
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
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    f.close();
                } catch (IOException ex) {
                    Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void crearTop(){
        Jugador j = new Jugador(txt1.getText(), puntos);
        ObjectOutputStream f = null;
        try {
            coleccion = new ArrayList();
            coleccion.add(j);
            f = new ObjectOutputStream(new FileOutputStream(fichero));
            f.writeObject(coleccion);
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reemplazarTop(){
        Jugador j = new Jugador(txt1.getText(), puntos);
        ObjectInputStream fi = null;
        ObjectOutputStream fo = null;
        try {
            fi = new ObjectInputStream(new FileInputStream(fichero));
            coleccion = (ArrayList)fi.readObject();
            coleccion.add(j);
            fichero.delete();
            fo = new ObjectOutputStream(new FileOutputStream(fichero));
            fo.writeObject(coleccion);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        int auxX = -1;
        int auxY = -1;
        while(c){
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
                            gameOver();
                            break;
                    }
                }
            if(pause == false)
                jlbPelota.setLocation((jlbPelota.getLocation().x + auxX), jlbPelota.getLocation().y + auxY);
            try {
                sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(AngryBirdsArcade.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(pause == false){
                puntos = puntos + 1;
                jlbPuntos.setText("Puntos: " + puntos);
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
                if(pause == false)
                    if(jlbBarra.getLocation().x > 0)
                        jlbBarra.setLocation((jlbBarra.getLocation().x - 15), jlbBarra.getLocation().y);
            if (key == KeyEvent.VK_RIGHT)
                if(pause == false)
                    if(jlbBarra.getLocation().x < (jpPanel.getSize().width - jlbBarra.getSize().width))
                        jlbBarra.setLocation((jlbBarra.getLocation().x + 15), jlbBarra.getLocation().y);
            if(key == KeyEvent.VK_P)
                pause();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {  
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            JButton bot = (JButton) e.getSource();
            switch (bot.getText()) {
                case "Enviar":            
                    if(fichero.exists()){
                        reemplazarTop();
                    }
                    else{
                        crearTop();
                    }
                    mostrarTop();
                    jpMarcador.remove(jlbTexto);
                    jpMarcador.remove(jbtnEnviar);
                    jpMarcador.remove(txt1);
                    repaint();
                    break;
                case "Nueva Partida": case "Reiniciar":
                    AngryBirdsArcade a = new  AngryBirdsArcade();
                    Thread t = new Thread(a);
                    t.start();
                    dispose();
                    break;
                case "Reanudar":
                    pause();
                    break;
                case "Cerrar":
                    System.exit(0);
                    break;
            }
    }
    
    public static void main(String[] args) {
        AngryBirdsArcade a = new  AngryBirdsArcade();
        Thread t = new Thread(a);
        t.start();
    }
}
