/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.mylibrary;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class MyArray {
    
    public static void rellenoNumAleatorios(float[] datos, int min, int max){
        
        for(int i = 0; i < datos.length; i++){
            datos[i] = Aleatorio.dameAleatorio(min, max);
        }
    }
    
    public static double calculaMedia(float[] datos){
        
        double suma = 0;
        
        for(int i = 0; i < datos.length; i++){
            suma = suma + datos[i]; 
        }
        return suma / datos.length;
    }
    
    public static float[] ordenarArray(float[] datos){
        
        float aux[];
        aux = new float[datos.length];
        
        float min;
        int c2 = 0;
        
        for(int c = 0; c < datos.length; c++){
            
            min = min(datos);
            if(min == datos[c] && c2 < datos.length){
                aux[c2] = datos[c];
                datos[c] = Integer.MAX_VALUE;
                c2++;
                c=-1;
            }
                

            
        }
        return aux;
    }
//        
//    public static void usuarioRellenaArray(int numerosUser[]) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce los numeros para rellenar el array");
//        for (int i = 0; i < numerosUser.length; i++) {
//            n = sc.nextInt();
//            i = comprobarNumerosNoRepes(numerosUser, n, i); //llamada al comprobador para que el usuario no meta numeros iguales
//        }
//    }
//    public static int comprobarNumerosNoRepes(int vector[], int num, int indice) {
//        boolean igual = false;
//        for (int j = 0; j <= indice; j++) {// recorre hasta i ya que marca el indice de hasta donde se ha llenado el vector
//            if (num == vector[j]) {// compara si el numero esta dentro del vector
//                System.out.println("Este numero esta repetido no vale: " + num);
//                igual = true;      // de encontrar el numero en el vector el boolean dira true
//                break;
//            } else {
//                igual = false;  // de no encontrarlo dira false
//            }
//        }
//        if (igual == false) { // si es false quiere decir que el numero no esta repetido
//            vector[indice] = num;    //entonces el numero es introducido segun el indice marcado por "i"
//        } else {        // en el caso contrario el bolean no se añada nada al vector
//            indice--;            // se le resta -1 a "i" para que haga la funcion de pedir ese numero del indice
//        }
//        return indice;
//    }
//    
//        public static int coincidenciasEnDosArrays(int numerosUser[], int vector[]) {
//        int contador = 0;
//        if (numerosUser.length != vector.length) {
//            System.out.println("Los tamaños de los vectores deben ser iguales");
//        } else {
//            
//            for (int i = 0; i < vector.length; i++) {
//                for (int j = 0; j <vector.length; j++) {
//                    if(numerosUser[i]==vector[j]){
//                        contador++;
//                    }
//                }
//            }
//        }
//        return contador;
//    }
//    
    public static float max(float[] datos){
        
        float max = Integer.MIN_VALUE;
        for(float i : datos){
            if(max < i)
                max = i;
        }
        
        return max;
    }
    
    public static float min(float[] datos){
        
        float min = Integer.MAX_VALUE;
        for(int i = 0; i < datos.length; i++){
            if(min > datos[i])
                min = datos[i];
        }
        
        return min;
    }
    
    public static String toString(float[] nAleatorio) {
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i < nAleatorio.length ; i++) {
            sb.append(nAleatorio[i] + " ");            
        }
        return sb.toString();
    }
    
}
