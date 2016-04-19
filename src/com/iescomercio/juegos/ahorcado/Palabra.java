package com.iescomercio.juegos.ahorcado;

import java.util.Arrays;

/**
 *
 * 
 */
public class Palabra {

    private final String palabraEscondida;
    private char[] palabraMostrar;
    private char[] aux;

    public Palabra(String palabraEscondida) {
        this.palabraEscondida = palabraEscondida;
        this.palabraMostrar = new char[palabraEscondida.length()];
        for (int i = 0; i < palabraEscondida.length(); i++) {
            palabraMostrar[i]='_';
        }
        aux = new char[palabraEscondida.length()];
        for (int i = 0; i < palabraEscondida.length(); i++) {
            aux[i]=palabraEscondida.charAt(i);
        }
    }
    
    public boolean comprueba(char v) {
        
        boolean estado = false;
        for (int i = 0; i < palabraEscondida.length(); i++) {
                if (palabraEscondida.charAt(i) == v) {
                    palabraMostrar[i]=v;
                    estado = true;
            }
        }
        return estado;
    }

    public boolean incompleta() {
        return Arrays.equals(palabraMostrar, aux);
    }
   
    public void mostrar() {

        for (int j = 0; j < palabraMostrar.length; j++)
        {
            System.out.print(palabraMostrar[j] + " ");
        }
        System.out.println("");
    }
}
