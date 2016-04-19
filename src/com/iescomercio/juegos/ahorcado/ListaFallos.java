package com.iescomercio.juegos.ahorcado;

import java.util.Arrays;

/**
 *
 *
 */
public class ListaFallos {

    private char[] fallos;
    private int contador;

    public ListaFallos() {
        fallos = new char[7];
    }

    public void mostrar() {
        System.out.println("Lista de fallos: "+Arrays.toString(fallos));
    }

    public void ponLetra(char v) {
        fallos[contador] = v;
        this.contador++;
    }

}
