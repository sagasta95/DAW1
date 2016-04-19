/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.gestion_recordatorios;

import com.iescomercio.menu.*;

/**
 *
 * @author PROF_VESPERTINO
 */
public class Run {

    public static final void main(String[] args) {
        // Inicializamos menu
        Menu menu = Menu.init();
        OpcionesMenu op = new OpcionesMenu();
        
        // Añadimos las opciones 
        menu.addOpcionMenu("Añadir Carpeta", () -> op.añadir_carpeta());
        menu.addOpcionMenu("Añadir Apunte", () -> op.añadir());
	menu.addOpcionMenu("Borrar Apunte", () -> op.borrar());
        menu.addOpcionMenu("Ver Apunte", () -> op.ver());
        menu.addOpcionMenu("Modificar Apunte", () -> op.modificar());
        menu.addOpcionMenu("Lista de Apuntes (orden natural)", () -> op.listado1());
        menu.addOpcionMenu("Lista de Apuntes (orden por hora)", () -> op.listtado2());
        menu.addOpcionMenu("Salir del Menu", () -> op.salir());
        
        // Mostrar menu
        menu.mostrarMenu();
        
    }
}
