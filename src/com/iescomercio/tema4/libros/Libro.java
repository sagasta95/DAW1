/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.libros;

/**
 *
 * @author Ángel
 */
public class Libro {
    //Atributos
    int isbn,nPaginas;
    float precio;
    String titulo;
    
    //Constructores
    public Libro(){
        isbn = 0;
        nPaginas = 0;
        precio = 10;
        titulo = "anonimo";
    }
    public Libro(int a){
        isbn = a;
    }
    
    //Metodos
        public void setIsbn(int y){
        isbn = y;
    }
        public void setTitulo(String titulo2){
        titulo = titulo2;
    }
        public void setNpaginas(int paginas2){
        nPaginas = paginas2;
    }
        public void setPrecio(float precio2){
        precio = precio2;
    }
        public int getIsbn(){
        return isbn;
    }
        public String getTitulo(){
        return titulo;
    }
        public int getPaginas(){
        return nPaginas;
    }
        public float getPrecio(){
        return precio;
    }
}
