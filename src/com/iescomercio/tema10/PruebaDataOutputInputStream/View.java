/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema10.PruebaDataOutputInputStream;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class View extends JFrame implements ActionListener, WindowListener{

    private JPanel jpPrincipal, jpHerramientas, jpAñadir, jpBorrar, jpModificar, jpConsulta;
    private JButton jbtnAñadir, jbtnBorrar, jbtnModificar, jbtnConsulta, jbtnAñadirNew, jbtnDelete;
    private JLabel jlbAñadirDni, jlbAñadirNombre, jlbAñadirApellido1, jlbAñadirApellido2, jlbAñadirEdad, jlbBorrarDni;
    private JTextField jtfñadirDni, jtfAñadirNombre, jtfAñadirApellido1, jtfAñadirApellido2, jtfAñadirEdad, jtfBorrarDni;
    private CursorCliente cc;
    private Dimension d;
    
    
    
    public View() {
        jpPrincipal = new JPanel(new BorderLayout());
        jpHerramientas = new JPanel(new GridLayout(1, 4));
        jbtnAñadir = new JButton("Nuevo");
        jbtnBorrar = new JButton("Borrar");
        jbtnConsulta = new JButton("Ver");
        jbtnModificar = new JButton("Modificar");
        d = new Dimension(500, 180);
        cc  = new CursorCliente();
        
        getContentPane().add(jpPrincipal);
        jpPrincipal.add(jpHerramientas, BorderLayout.NORTH);
        
        jpHerramientas.add(jbtnAñadir, BorderLayout.NORTH);
        jpHerramientas.add(jbtnBorrar, BorderLayout.NORTH);
        jpHerramientas.add(jbtnModificar, BorderLayout.NORTH);
        jpHerramientas.add(jbtnConsulta, BorderLayout.NORTH);
        
        this.addWindowListener(this);
        jbtnAñadir.addActionListener(this);
        jbtnBorrar.addActionListener(this);
        jbtnModificar.addActionListener(this);
        jbtnConsulta.addActionListener(this);
                                 
        cc.cargarFichero();
        
        crearVistaAñadir();
        crearVistaBorrar();
        
        
        setSize(d);
        setResizable(false);
        setTitle("Data Input/Output Stream");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void crearVistaAñadir(){
        jpAñadir = new JPanel(null);
        jlbAñadirDni = new JLabel("DNI:");
        jlbAñadirNombre = new JLabel("Nombre:");
        jlbAñadirApellido1 = new JLabel("Primer Apellido:");
        jlbAñadirApellido2 = new JLabel("Segundo Apellido:");
        jlbAñadirEdad = new JLabel("Edad:");
        jtfñadirDni = new JTextField();
        jtfAñadirNombre = new JTextField();
        jtfAñadirApellido1 = new JTextField();
        jtfAñadirApellido2 = new JTextField();
        jtfAñadirEdad = new JTextField();
        jbtnAñadirNew = new JButton("+");
        jbtnAñadirNew.addActionListener(this);
        jpPrincipal.add(jpAñadir, BorderLayout.CENTER);
        jpAñadir.add(jlbAñadirDni);
        jpAñadir.add(jtfñadirDni);
        jpAñadir.add(jlbAñadirNombre);
        jpAñadir.add(jtfAñadirNombre);
        jpAñadir.add(jlbAñadirApellido1);
        jpAñadir.add(jtfAñadirApellido1);
        jpAñadir.add(jlbAñadirApellido2);
        jpAñadir.add(jtfAñadirApellido2);
        jpAñadir.add(jlbAñadirEdad);
        jpAñadir.add(jtfAñadirEdad);
        jpAñadir.add(jbtnAñadirNew);
        jlbAñadirDni.setBounds(10, 10, 100, 25);
        jtfñadirDni.setBounds(115, 10, 100, 25);
        jlbAñadirNombre.setBounds(10, 50, 100, 25);
        jtfAñadirNombre.setBounds(115, 50, 100, 25);
        jlbAñadirApellido1.setBounds(240, 10, 100, 25);
        jtfAñadirApellido1.setBounds(380, 10, 100, 25);
        jlbAñadirApellido2.setBounds(240, 50, 100, 25);
        jtfAñadirApellido2.setBounds(380, 50, 100, 25);
        jlbAñadirEdad.setBounds(10, 90, 100, 25);
        jtfAñadirEdad.setBounds(115, 90, 100, 25);
        jbtnAñadirNew.setBounds(428, 90, 50, 25);
        jpAñadir.setVisible(false);
    }
    
    private void crearVistaBorrar(){
        jpBorrar = new JPanel(null);
        jlbBorrarDni = new JLabel("DNI:");
        jtfBorrarDni = new JTextField();
        jbtnDelete = new JButton("Delete");
        jpPrincipal.add(jpBorrar, BorderLayout.CENTER);
        jpBorrar.add(jlbBorrarDni);
        jpBorrar.add(jtfBorrarDni);
        jpBorrar.add(jbtnDelete);
        jlbBorrarDni.setBounds(170, 30, 100, 25);
        jtfBorrarDni.setBounds(220, 30, 100, 25);
        jbtnDelete.setBounds(200, 90, 100, 25);
        jpBorrar.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bot = (JButton) e.getSource();
        switch(bot.getText()){
            case "Nuevo":
                    jpBorrar.removeAll();
                    crearVistaAñadir();
                    jpAñadir.setVisible(true);

                break;
            case "+":
                Cliente c1 = new Cliente(jtfñadirDni.getText(), jtfAñadirNombre.getText(), jtfAñadirApellido1.getText(), jtfAñadirApellido2.getText(), jtfAñadirEdad.getText());
                cc.añadir(c1);
                jtfñadirDni.setText("");
                jtfAñadirNombre.setText("");
                jtfAñadirApellido1.setText("");
                jtfAñadirApellido2.setText("");
                jtfAñadirEdad.setText("");
                break;
            case "Borrar":
                jpAñadir.removeAll();
                crearVistaBorrar();
                jpBorrar.setVisible(true);
                break;
            case "Delete":
                Cliente c2 = new Cliente(jtfBorrarDni.getText(), "", "", "", "");
                cc.borrar(c2);
                jtfBorrarDni.setText("");
                break;
        }
    }
    
    public static void main(String[] args) {
        new View();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        cc.reemplazarFichero();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
