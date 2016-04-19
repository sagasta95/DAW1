package com.iescomercio.juegos.ahorcado;

/**
 *
 *
 */
public class Ahorcado {

    public void jugar() {
        
        Jugador jugador = new Jugador();
        Palabra palabra = new Palabra("ahorcado");
        Horca horca = new Horca();
        ListaFallos lista = new ListaFallos();
        
        jugador.pedirNombre();

        do {
            palabra.mostrar();
            horca.mostrar();
            lista.mostrar();
            char v = jugador.dameLetra();
            if (!palabra.comprueba(v)) {
                horca.ponItem();
                lista.ponLetra(v);
            }
        } while (horca.estaVivo() && !palabra.incompleta());
        
        if(!horca.estaVivo()){
            System.out.println(jugador.getNombre()+" ha sido ahorcado");
        } else {
            System.out.println("Felicidades, "+jugador.getNombre()+", se ha salvado");
        }
    }
}
