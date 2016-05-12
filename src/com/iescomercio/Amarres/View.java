/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.Amarres;

import com.iescomercio.tema10.PruebaDataOutputInputStream.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VESPERTINO
 */
public class View extends JInternalFrame implements ActionListener, InternalFrameListener{

    private JPanel jpPrincipal, jpHerramientas, jpAñadir, jpBorrar, jpModificar, jpConsulta, jpModificar2;
    private JButton jbtnAñadir, jbtnBorrar, jbtnModificar, jbtnConsulta, jbtnAñadirNew, jbtnDelete, jbtnEdit, jbtnOk;
    private JLabel jlbAñadirDni, jlbAñadirNombre, jlbAñadirApellido1, jlbAñadirApellido2, jlbAñadirEdad, jlbBorrarDni, jlbModificar;
    private JTextField jtfñadirDni, jtfAñadirNombre, jtfAñadirApellido1, jtfAñadirApellido2, jtfAñadirEdad, jtfBorrarDni, jtfModificar;
    private JScrollPane jspConsulta;
    private DAO_BaseDatos dao;
    private Dimension d;
    
    public View() {
        jpPrincipal = new JPanel(new BorderLayout());
        jpHerramientas = new JPanel(new GridLayout(1, 4));
        jbtnAñadir = new JButton("Nuevo");
        jbtnBorrar = new JButton("Borrar");
        jbtnConsulta = new JButton("Ver");
        jbtnModificar = new JButton("Modificar");
        d = new Dimension(500, 180);
        dao = new DAO_BaseDatos();

        
        getContentPane().add(jpPrincipal);
        jpPrincipal.add(jpHerramientas, BorderLayout.NORTH);
        
        jpHerramientas.add(jbtnAñadir, BorderLayout.NORTH);
        jpHerramientas.add(jbtnBorrar, BorderLayout.NORTH);
        jpHerramientas.add(jbtnModificar, BorderLayout.NORTH);
        jpHerramientas.add(jbtnConsulta, BorderLayout.NORTH);
        
        this.addInternalFrameListener(this);
        jbtnAñadir.addActionListener(this);
        jbtnBorrar.addActionListener(this);
        jbtnModificar.addActionListener(this);
        jbtnConsulta.addActionListener(this);
                     
        dao.cargar();
        
        crearVistaAñadir();
        crearVistaBorrar();
        crearVistaModificar();
        crearVistaModificar2();
        crearVistaVer();
        
        setClosable(true);   
        setSize(d);
        setResizable(false);
        setTitle("Barcos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void crearVistaAñadir(){
        jpAñadir = new JPanel(null);
        jlbAñadirDni = new JLabel("Matricula:");
        jlbAñadirNombre = new JLabel("Año de fabricacion::");
        jlbAñadirApellido1 = new JLabel("Eslora (m):");
        jlbAñadirApellido2 = new JLabel("CV:");
        jlbAñadirEdad = new JLabel("Nº Camarotes:");
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
        jlbBorrarDni = new JLabel("Matricula:");
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
        jlbModificar = new JLabel("Matricula:");
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
        jspConsulta = new JScrollPane(dao.ver());
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
                Barcos c1 = new Barcos(jtfñadirDni.getText(), Integer.parseInt(jtfAñadirNombre.getText()), Integer.parseInt(jtfAñadirApellido1.getText()), Integer.parseInt(jtfAñadirApellido2.getText()), Integer.parseInt(jtfAñadirEdad.getText()));
                if(dao.añadir(c1)){
                    jtfñadirDni.setText("");
                    jtfAñadirNombre.setText("");
                    jtfAñadirApellido1.setText("");
                    jtfAñadirApellido2.setText("");
                    jtfAñadirEdad.setText("");
                    JOptionPane.showMessageDialog(this, "Barco creado con exito", "OK", 1);
                }
                else
                    JOptionPane.showMessageDialog(this, "Ya existe un barco con esta Matricula", "Advertencia", 2);
                break;
            case "Delete":
                Barcos c2 = new Barcos(jtfBorrarDni.getText(), 0, 0, 0, 0);
                if (dao.borrar(c2)){
                    jtfBorrarDni.setText("");
                    JOptionPane.showMessageDialog(this, "Barco borrado con exito", "OK", 1);
                }
                else   
                    JOptionPane.showMessageDialog(this, "No existe un barco con esta matricula", "Error", 0);
                break;
            case "Edit":
                Barcos c3 = new Barcos(jtfModificar.getText(), 0, 0, 0, 0);
                if(dao.modificar1(c3)){
                    verModificar2();
                    JOptionPane.showMessageDialog(this, "Introduce los nuevos datos", "OK", 1);
                }
                else
                    JOptionPane.showMessageDialog(this, "El barco no existe", "Error", 0);
                break;
            case "OK":
                Barcos c4 = new Barcos(jtfñadirDni.getText(), Integer.parseInt(jtfAñadirNombre.getText()), Integer.parseInt(jtfAñadirApellido1.getText()), Integer.parseInt(jtfAñadirApellido2.getText()), Integer.parseInt(jtfAñadirEdad.getText()));
                if(dao.modificar2(c4)){ 
                    JOptionPane.showMessageDialog(this, "Barco modificado con exito", "OK", 1);
                    verModificar();
                }
                else
                    JOptionPane.showMessageDialog(this, "Ya existe un barco con esta matricula", "Advertencia", 2);
                break;
        }
    }
    
    @Override
    public void internalFrameOpened(InternalFrameEvent e) {

    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        this.setVisible(false);
        dao.guardar();
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {

    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {

    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {

    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {

    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {

    }
    
}
