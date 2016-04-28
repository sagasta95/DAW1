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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VESPERTINO
 */
public class View extends JFrame implements ActionListener, WindowListener{

    private JPanel jpPrincipal, jpHerramientas, jpAñadir, jpBorrar, jpModificar, jpConsulta, jpModificar2;
    private JButton jbtnAñadir, jbtnBorrar, jbtnModificar, jbtnConsulta, jbtnAñadirNew, jbtnDelete, jbtnEdit, jbtnOk;
    private JLabel jlbAñadirDni, jlbAñadirNombre, jlbAñadirApellido1, jlbAñadirApellido2, jlbAñadirEdad, jlbBorrarDni, jlbModificar;
    private JTextField jtfñadirDni, jtfAñadirNombre, jtfAñadirApellido1, jtfAñadirApellido2, jtfAñadirEdad, jtfBorrarDni, jtfModificar;
    private JScrollPane jspConsulta;
    private JTable tabla;
    private DefaultTableModel modelo;
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
                                 
        cc.cargarDatos();
        
        crearVistaAñadir();
        crearVistaBorrar();
        crearVistaModificar();
        crearVistaModificar2();
        crearVistaVer();
        
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
        jbtnDelete.addActionListener(this);
        jpPrincipal.add(jpBorrar, BorderLayout.CENTER);
        jpBorrar.add(jlbBorrarDni);
        jpBorrar.add(jtfBorrarDni);
        jpBorrar.add(jbtnDelete);
        jlbBorrarDni.setBounds(170, 30, 100, 25);
        jtfBorrarDni.setBounds(220, 30, 100, 25);
        jbtnDelete.setBounds(200, 90, 100, 25);
        jpBorrar.setVisible(false);
    }
    
    private void crearVistaModificar(){
        jpModificar = new JPanel(null);
        jlbModificar = new JLabel("DNI:");
        jtfModificar = new JTextField();
        jbtnEdit = new JButton("Edit");
        jbtnEdit.addActionListener(this);
        jpPrincipal.add(jpModificar, BorderLayout.CENTER);
        jpModificar.add(jlbModificar);
        jpModificar.add(jtfModificar);
        jpModificar.add(jbtnEdit);
        jlbModificar.setBounds(170, 30, 100, 25);
        jtfModificar.setBounds(220, 30, 100, 25);
        jbtnEdit.setBounds(200, 90, 100, 25);
        jpModificar.setVisible(false);
    }
    
    private void crearVistaModificar2(){
        jpModificar2 = new JPanel(null);
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
        jbtnOk = new JButton("OK");
        jbtnOk.addActionListener(this);
        jpPrincipal.add(jpModificar2, BorderLayout.CENTER);
        jpModificar2.add(jlbAñadirDni);
        jpModificar2.add(jtfñadirDni);
        jpModificar2.add(jlbAñadirNombre);
        jpModificar2.add(jtfAñadirNombre);
        jpModificar2.add(jlbAñadirApellido1);
        jpModificar2.add(jtfAñadirApellido1);
        jpModificar2.add(jlbAñadirApellido2);
        jpModificar2.add(jtfAñadirApellido2);
        jpModificar2.add(jlbAñadirEdad);
        jpModificar2.add(jtfAñadirEdad);
        jpModificar2.add(jbtnOk);
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
        jbtnOk.setBounds(370, 90, 90, 25);
        jpModificar2.setVisible(false);
    }
    
    private void crearVistaVer(){
        jpConsulta = new JPanel(new GridLayout(1, 1));
        jpPrincipal.add(jpConsulta, BorderLayout.CENTER);   
        jspConsulta = new JScrollPane(cc.consulta());
        jpConsulta.add(jspConsulta);
        jpConsulta.setVisible(false);
    }
    
    private void verAñadir(){
        jpBorrar.setVisible(false);
        jpConsulta.setVisible(false);
        jpModificar.setVisible(false);
        jpModificar2.setVisible(false);
        crearVistaAñadir();
        jpAñadir.setVisible(true);
        jbtnBorrar.setEnabled(true);
        jbtnAñadir.setEnabled(false);
        jbtnConsulta.setEnabled(true);
        jbtnModificar.setEnabled(true);
    }
    
    private void verBorrar(){
        jpConsulta.setVisible(false);
        jpModificar.setVisible(false);
        jpModificar2.setVisible(false);
        jpAñadir.setVisible(false);
        crearVistaBorrar();
        jpBorrar.setVisible(true);
        jbtnBorrar.setEnabled(false);
        jbtnAñadir.setEnabled(true);
        jbtnConsulta.setEnabled(true);
        jbtnModificar.setEnabled(true);
    }
    
    private void verModificar(){
        jpBorrar.setVisible(false);
        jpConsulta.setVisible(false);
        jpModificar2.setVisible(false);
        jpAñadir.setVisible(false);
        crearVistaModificar();
        jpModificar.setVisible(true);
        jbtnBorrar.setEnabled(true);
        jbtnAñadir.setEnabled(true);
        jbtnConsulta.setEnabled(true);
        jbtnModificar.setEnabled(false);
    }
    
    private void verVer(){
        jpBorrar.setVisible(false);
        jpModificar.setVisible(false);
        jpModificar2.setVisible(false);
        jpAñadir.setVisible(false);
        crearVistaVer();
        jpConsulta.setVisible(true);
        jbtnBorrar.setEnabled(true);
        jbtnAñadir.setEnabled(true);
        jbtnConsulta.setEnabled(false);
        jbtnModificar.setEnabled(true);
    }
    
    private void verModificar2(){
        jpBorrar.setVisible(false);
        jpConsulta.setVisible(false);
        jpModificar.setVisible(false);
        jpAñadir.setVisible(false);
        crearVistaModificar2();
        jpModificar2.setVisible(true);
        jbtnBorrar.setEnabled(false);
        jbtnAñadir.setEnabled(false);
        jbtnConsulta.setEnabled(false);
        jbtnModificar.setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bot = (JButton) e.getSource();
        switch(bot.getText()){
            case "Nuevo":
                verAñadir();
                break;
            case "Borrar":
                verBorrar();
                break;
            case "Modificar":
                verModificar();
                break;
            case "Ver":
                verVer();
                break;
            case "+":
                Cliente c1 = new Cliente(Long.parseLong(jtfñadirDni.getText()), jtfAñadirNombre.getText(), jtfAñadirApellido1.getText(), jtfAñadirApellido2.getText(), Integer.parseInt(jtfAñadirEdad.getText()));
                if(cc.añadir(c1)){
                    jtfñadirDni.setText("");
                    jtfAñadirNombre.setText("");
                    jtfAñadirApellido1.setText("");
                    jtfAñadirApellido2.setText("");
                    jtfAñadirEdad.setText("");
                    JOptionPane.showMessageDialog(this, "Cliente creado con exito", "OK", 1);
                }
                else
                    JOptionPane.showMessageDialog(this, "Ya existe un cliente con este DNI", "Advertencia", 2);
                break;
            case "Delete":
                Cliente c2 = new Cliente(Long.parseLong(jtfBorrarDni.getText()), "", "", "", 0);
                if (cc.borrar(c2)){
                    jtfBorrarDni.setText("");
                    JOptionPane.showMessageDialog(this, "Cliente borrado con exito", "OK", 1);
                }
                else   
                    JOptionPane.showMessageDialog(this, "No existe el cliente", "Error", 0);
                break;
            case "Edit":
                Cliente c3 = new Cliente(Long.parseLong(jtfModificar.getText()), "", "", "", 0);
                if(cc.borrar(c3)){
                    verModificar2();
                    JOptionPane.showMessageDialog(this, "Introduce los nuevos datos", "OK", 1);
                }
                else
                    JOptionPane.showMessageDialog(this, "No existe un cliente con este DNI", "Advertencia", 2);
                break;
            case "OK":
                Cliente c4 = new Cliente(Long.parseLong(jtfñadirDni.getText()), jtfAñadirNombre.getText(), jtfAñadirApellido1.getText(), jtfAñadirApellido2.getText(), Integer.parseInt(jtfAñadirEdad.getText()));
                if(cc.añadir(c4)){ 
                    JOptionPane.showMessageDialog(this, "Cliente modificado con exito", "OK", 1);
                    verModificar();
                }
                else
                    JOptionPane.showMessageDialog(this, "Ya existe un cliente con este DNI", "Advertencia", 2);
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
        cc.guardarDatos();
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
