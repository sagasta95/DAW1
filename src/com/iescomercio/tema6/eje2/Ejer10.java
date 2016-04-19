//10.Realizar un método que recibe un número N (entero + 0) y devuelve un String. El 
//método creará inicialmente un String con números entre 1 y 100 y posteriormente 
//eliminará el número N del String retornándolo.
package com.iescomercio.tema6.eje2;

public class Ejer10 {

    //Convierte el numero entero a String
    public static String recibe(int n) {
        String aux = Integer.toString(n);
        return aux;
    }

    // relleno un String con numeros entre 1 - 100
    public static String relleno() {
        StringBuilder aux = new StringBuilder("");
        for (int i = 1; i < 101; i++) {
            aux.append(i);
        }
        return aux.toString();
    }

    //borrar el numero N de la cadena 
    public static String borrarN(String cadena, String n) {
        StringBuilder cadena2 = new StringBuilder("");
        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == n.charAt(0)) {

            } else {
                cadena2.append(cadena.charAt(i));
            }

        }
        return cadena2.toString();
    }

    // metodo main principal
    public static void main(String[] args) {
        int n = 3;
        String nString = recibe(n), cadena = relleno();
        System.out.println(borrarN(cadena, nString));
    }
}
