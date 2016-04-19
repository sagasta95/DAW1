package com.iescomercio.tema12;

import java.awt.Dimension;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Pelota extends JFrame implements KeyListener {

    private JPanel jpPanel;
    private JLabel jlbPelota;
    private URL urlPelota;
    private ImageIcon imagenPelota;

    public Pelota() {
        urlPelota = getClass().getResource("/imagenes/pelota.gif");
        imagenPelota = new ImageIcon(urlPelota);

        jpPanel = new JPanel();
        jlbPelota = new JLabel(imagenPelota);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jpPanel);
        getContentPane().setPreferredSize(new Dimension(800, 800));

        jpPanel.setLayout(null);
        jpPanel.addKeyListener(this);
        jpPanel.setFocusable(true); // Al arrancar la app 
        
        jpPanel.add(jlbPelota);
        jlbPelota.setBounds(300, 300, imagenPelota.getIconWidth(), imagenPelota.getIconHeight());
        

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            jlbPelota.setLocation((jlbPelota.getLocation().x - 10), jlbPelota.getLocation().y);
        }

        if (key == KeyEvent.VK_RIGHT) {
            jlbPelota.setLocation((jlbPelota.getLocation().x + 10), jlbPelota.getLocation().y);
        }

        if (key == KeyEvent.VK_UP) {
            jlbPelota.setLocation(jlbPelota.getLocation().x, jlbPelota.getLocation().y - 10);
        }

        if (key == KeyEvent.VK_DOWN) {
            jlbPelota.setLocation(jlbPelota.getLocation().x, jlbPelota.getLocation().y + 10);
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        Pelota a = new Pelota();

    }
}
