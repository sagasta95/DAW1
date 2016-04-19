/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio8 extends Applet {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.drawRect(200, 400, 250, 250);
        g.setColor(Color.BLUE);
        g.fillRect(284, 520, 84, 130);
        g.setColor(Color.BLUE);
        g.drawLine(200, 400, 325, 225);
        g.setColor(Color.BLUE);
        g.drawLine(450, 400, 325, 225);
        g.setColor(Color.BLUE);
        g.drawOval(296, 312, 60, 60);
        g.setColor(Color.ORANGE);
        g.fillRect(750, 400, 60, 250);
        g.setColor(Color.GREEN);
        g.fillOval(705, 300, 150, 150);
        g.setColor(Color.YELLOW);
        g.fillOval(550, 150, 75, 75);
        g.setColor(Color.BLUE);
        g.fillArc(200, 275, 250, 250, 0, 180);
    }
}
