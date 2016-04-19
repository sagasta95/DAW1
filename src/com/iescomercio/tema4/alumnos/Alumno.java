/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.alumnos;

/**
 *
 * @author VESPERTINO
 */
public class Alumno {
    //Atributos
        int nExpediente, curso;
        String nombre, pApellido;

    //Contructores       
       public Alumno(){
      }
      public Alumno(int z, int x, String v, String n){
        nExpediente = z;
        curso = x;
        nombre = v;
        pApellido = n;
      }
       public Alumno(int a){
        nExpediente = a;
      }
       public Alumno(int g, String p){
        nExpediente = g;
        nombre = p;
      }
         //Metodos
       public void setNexp(int y){
        nExpediente = y;
    }
       public void setCurso(int c){
        curso = c;
    }
       public void setNombre(String n){
        nombre = n;
    }
       public void setPapellido(String p){
        pApellido = p;
    }
      
       public int getNexp(){
        return nExpediente;
}
       public int getCurso(){
        return curso;
    }
       public String getNombre(){
        return nombre;
      }
       public String getPapellido(){
        return pApellido;
      }
       public String presentate (){
         return "Curso: " + curso +"\t Nombre: "+ nombre +"\t Apellido: "+ pApellido +"\t Numero Expediente: "+ nExpediente ;
      }     
       
}
