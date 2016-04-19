/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.nif;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class NIF {
    long dni;
    char letra;
    
    
    public NIF(){
        dni = 0;
        letra = ' ';
    }
    public NIF(long pdni, char pletra){
        dni = pdni;
        letra = pletra;
    }
    public void setDni(long pdni){
        dni = pdni;
        letra = calcularLetra((char)dni);
    }
    public double getDni(){
        return dni;
    }
    public void scanDni(){
        long x;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el numero de dni: ");
        x = sc.nextLong();
        dni = x;
        letra = calcularLetra((int)dni);

    }
    private char calcularLetra(int dni){
        int calculo;
        calculo =  dni % 23;
        switch(calculo){
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W'; 
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
            default:
                return '#';
        }
        
    }
    
    public void mostrar(){
        System.out.println("NIF: " + dni + "-" + letra);
    }
}
