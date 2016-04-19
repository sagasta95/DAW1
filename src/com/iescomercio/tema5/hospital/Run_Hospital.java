/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.hospital;

/**
// *
 * @author VESPERTINO
 */
public class Run_Hospital {
    public static void main(String[] args) {
        
        MedicoDeCabecera m1 = new MedicoDeCabecera();
        Cirujano m2 = new Cirujano();
        Medico m3 = new Medico();
        
        m1.tratarPaciente();
        m1.aconsejaPacientes();
        m1.trabajaEnHospital = false;
        m1.visitaLasCasas = true;
        
        m2.trabajaEnHospital = true;
        m2.hacerIncision();
        m2.tratarPaciente();
        
        m3.trabajaEnHospital = true;
        m3.tratarPaciente();
        m3.notify();
    }
}
