/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.menu;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * The Command functional interface.<br/>
 */

/**
 * The CommandFactory class.<br/>
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class Menu {
    private ArrayList<String> lista;
    private final HashMap<String, Command> commands;
    private boolean salir;

    private Menu() {
        commands = new HashMap<>();
        lista = new ArrayList();
        salir =false;        
    }

    public void addOpcionMenu(String name, Command command) {
        commands.put(name, command);
        lista.add(name);
    }

    public void ejecutarOpcion(String name) {
        if (commands.containsKey(name)) {
            commands.get(name).apply();
        }
    }

    public void listarOpciones() {
        int c=1;
        for (Iterator<String> iterator = lista.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println("(" + (c++) + ") " + next);
        }
 
    }

    /* Factory pattern */
    public static Menu init() {
        Menu cf = new Menu();
        return cf;
    }

    public void pedirOpcion() {
        Scanner s = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Indique la opcion:");
            opcion = s.nextInt();            
            if (opcion>=1 && opcion<=commands.size())
                ejecutarOpcion(lista.get(opcion-1));
            else 
                System.out.println("Opcion no válida");
        } while (opcion != commands.size());
        if (opcion == commands.size()) {
            salir = true;
        }
    }

    public void mostrarMenu() {
         do {
            this.listarOpciones();
            this.pedirOpcion();
        } while(!this.salir());
    }
    
    public boolean salir() {
        return salir;
    }

}
