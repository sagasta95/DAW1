//implementar un programa usando swing que muestre una ventana con un border layout, 
//donde el top sea amarillo, right  verde bottom naranja, left azul.
//Posteriormente en el panel central mediante un borderLayout mostrara pero ahora los colores 
//rotaran(azul,amarillo, verde, naranja) y asi sucesivamente 10 veces en bucle
package com.iescomercio.tema12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.*;
import javax.swing.*;

public class Ventana3 extends JFrame {

    private JPanel[] panales, panalesCentrales;
    private LinkedList<Color> colores;
    private ArrayList<String> posiciones;

    public Ventana3() {
        panales = new JPanel[5];
        panalesCentrales = new JPanel[10];
        colores = new LinkedList();
        posiciones = new ArrayList();    
        
        
        getContentPane().setLayout(new BorderLayout(5,5));

        colores.add(Color.RED);
        colores.add(Color.BLUE);
        colores.add(Color.ORANGE);
        colores.add(Color.green);
       

        posiciones.add(BorderLayout.NORTH);
        posiciones.add(BorderLayout.WEST);
        posiciones.add(BorderLayout.SOUTH);
        posiciones.add(BorderLayout.EAST);
        posiciones.add(BorderLayout.CENTER);

        for (int i = 0; i < panalesCentrales.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    if (j < 4) {
                        panales[j] = new JPanel();
                        panales[j].setBackground(colores.get(j));
                        this.add(panales[j], posiciones.get(j));
                    } else {
                        panalesCentrales[i] = new JPanel(new BorderLayout(5,5));
                        this.add(panalesCentrales[i], posiciones.get(j));
                    }
                } else {
                    if (j < 4) {
                        panales[j] = new JPanel();
                        panales[j].setBackground(colores.get(j));
                        panalesCentrales[i - 1].add(panales[j], posiciones.get(j));
                    } else {
                        panalesCentrales[i] = new JPanel(new BorderLayout(5,5));
                        panalesCentrales[i - 1].add(panalesCentrales[i], posiciones.get(j));
                    }

                }
            }
            colores.addLast(colores.removeFirst());
        }

        setVisible(true);//hacer visible la ventana
        setLocationRelativeTo(null);//para que la ventana salga centrada
        setTitle("Ventana 3");//titulo de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para terminar proceso al cerrar ventana
        pack();//para que los botones se adaptel al tamaño de la ventana
    }

    public static void main(String[] args) {
        Ventana3 v3 = new Ventana3();
    }
}
