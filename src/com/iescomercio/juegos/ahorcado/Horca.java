package com.iescomercio.juegos.ahorcado;

/**
 *
 * 
 */
public class Horca {
    
    private int errores;

    public Horca() {
    }
    
    public void mostrar() {
        switch  (errores){
            case 0:
                // Mostrar la base
            case 1:
                // Mostrar la base + horca
            case 2: 
                // Base + horca + cabeza
        }
        System.out.println("Lleva "+errores+" de 7 fallos");
    }

    public void ponItem() {
        this.errores++;
    }

    public boolean estaVivo() {
        return errores<7;
    }

}
