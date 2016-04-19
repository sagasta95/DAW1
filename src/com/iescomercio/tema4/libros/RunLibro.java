/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.libros;

import com.iescomercio.tema4.libros.Libro;

/**
 *
 * @author Ángel
 */
public class RunLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro(); //Declaración e instanciación
        System.out.println("El titulo es: " + libro1.getTitulo());
        libro1.setTitulo("Quijote");
        System.out.println("El titulo es: " + libro1.getTitulo());
        System.out.println("Numero de paginas: " + libro1.getPaginas());
        libro1.setNpaginas(421);
        System.out.println("Numero de paginas: " + libro1.getPaginas());
        System.out.println("Precio del libro: " + libro1.getPrecio());
        libro1.setPrecio((float)32.5);
        System.out.println("Precio del libro: " + libro1.getPrecio());
        System.out.println("Numero del ISBN: " + libro1.getIsbn());
        libro1.setIsbn(1245);
        System.out.println("Numero del ISBN: " + libro1.getIsbn());
        libro1.notify();
    }   
}
