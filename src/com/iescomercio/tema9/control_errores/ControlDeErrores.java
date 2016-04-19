/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema9.control_errores;

import Excepciones.NumeroNegativoException;
import com.iescomercio.mylibrary.Aleatorio;
import java.io.File;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class ControlDeErrores {

    public static int[] metodo1(int dividendo, int divisor) {

        int[] datos = new int[2];
        int cociente, resto;

        if (divisor == 0) {
            System.out.println("No se puede dividir entre 0.");
            return null;
        } else {
            cociente = dividendo / divisor;
            resto = dividendo % divisor;
            datos[0] = cociente;
            datos[1] = resto;
            return datos;
        }
    }

    public static int[] metodo2(int dividendo, int divisor) {

        int[] datos;
        int cociente, resto;

        try {
            datos = new int[2];
            cociente = dividendo / divisor;
            resto = dividendo % divisor;
            datos[0] = cociente;
            datos[1] = resto;
            return datos;
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir entre 0.");
            return null;
        }
    }

    public static Integer metodo3(int indice) {

        try {
            LinkedList<Integer> ll = new LinkedList();
            int aleatorio;
            for (int c = 0; c < 100; c++) {
                aleatorio = (int) Aleatorio.dameAleatorio(0, 99);
                ll.add(aleatorio);
            }
            return ll.get(indice);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("El indice esta fuera del rango");
            return null;
        }
    }

    public static void metodo4(File aFile) {

        try {
            if (null == aFile) {
                throw new Exception("El fichero es nulo.");
            }
        } catch (Exception ex) {
            System.out.println("El fichero no existe.");
        }

    }

    //realizar un metodo llamadoo lanzar que reciba un entero, 
    //si el entero es mayor de 5 mostraremos la tabla de multiplicar de 
    //ese numero, si es 1 o 3 provocaremos una excepcion mostrando el mensaje 
    //"no quiero impares peqqueños". Si es 2 o 4 mostraremos "pares tampoco" 
    //y si es 0 lanzaremos una excepcion de tipo SQLException.
    public static void lanzar(int n) {

        try {
            if (n > 5) {
                for(int c = 1; c <= 10; c++){
                    System.out.println(n + " * " + c + " = " + n*c);
                }
            } 
            else if (n == 1 || n == 3)
                throw new Exception("No quiero impares pequeños.");
            else if (n == 2 || n == 4)
                throw new Exception("Pares tampoco.");
            else if (n == 0)
                throw new SQLException("Error sql.");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void metodo6(int n){
        try{
            if(n < 0)
                throw new NumeroNegativoException();
        }
        catch(NumeroNegativoException nne){
            System.out.println(nne.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ControlDeErrores.metodo6(-2);
    }
}
