/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.clase_mates;

/**
 *
 * @author Ángel
 */
public class Mates_angel {

    private int numero;

    public Mates_angel(int numero) {
            this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
            this.numero = numero;
    }

    //devuelve VERDAD o FALSO dependiendo de si el número es perfecto o no

    public boolean esPerfecto() {
        int suma=0;
    for (int i = 1; i < numero; i++) {
            if(numero%(i % numero)==0){//saco todos los restos  y veo si son divisibles con el numero para sumarlos
            suma = suma + (i % numero);
            }
        }
        if(suma==numero){
            return true;
        }else{
            return false;
        }
    }

    //devuelve VERDAD o FALSO dependiendo de si el número es primo o no..

    public boolean esPrimo() {
        int contador = 0;
        for (int i = 2; i <= numero; i++) {//empiezo a dos para decir que solo sean divisibles por si mismo
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 1) {
            return true;
        } else {
            return false;
        }
    }

    //  visualiza todos los números perfectos menores que el valor del número.

    public void listaPerfectos() {
           int suma;
           System.out.println("Lista de numeros perfectos hasta N");
        for (int b = 1; b <= numero; b++) {
            suma = 0;       //Siempre a 0 para comprobar la suma del siguiente numero
            for (int a = 1; a < b; a++) {
                if (b % (a % b) == 0) {
                    suma = suma + (a % b);
                }
            }
            if (suma == b) {
                System.out.println("Es perfecto: " + b);
            }
        }
    }
    //visualiza todos los números menores o iguales que el valor del número
    public void listaNumeros (){
        for(int a=1; a<=numero; a++){
            System.out.println(a);
        }
    }
    //devuelve la suma de las cifras del valor del número
    public int sumaCifras(){
        int suma=0;
        while(numero!=0){
            suma=suma+(numero%10);
            numero=numero/10;
        }
        return suma;
    }
    //devuelve el número de divisores que tiene el número
    public int numDivisores (){
        int contador=0;
         for (int i = 1; i <=numero; i++) {
            if(numero%i==0){
                contador++;
            }
        }
        return contador;
    }
    //devuelve una cadena que es el resultado de pasar a binario el número en decimal
    public String base2(){
       //return Integer.toBinaryString(numero);
      String binario="";
      while(numero!=0){ //se pone hasta 0 para quedarte con el resultado de la ultima división
          if(numero%2==0){
              binario="0"+binario;
          }else{
              binario="1"+binario;
          }
          numero=numero/2;
      }
      return binario;
    }
}