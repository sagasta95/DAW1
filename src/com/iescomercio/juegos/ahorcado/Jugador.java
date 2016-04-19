package com.iescomercio.juegos.ahorcado;

import java.util.Scanner;

/**
 *
 * 
 */
public class Jugador {
    
    private String nombre;

    public void pedirNombre() {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        this.nombre = t.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public char dameLetra() {
        Scanner t = new Scanner(System.in);
        char aux;
        System.out.println("Introduzca una letra, "+nombre);
        aux = t.next().charAt(0);
        
        return aux;
    }
}
