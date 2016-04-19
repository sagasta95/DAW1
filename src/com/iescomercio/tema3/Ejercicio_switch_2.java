/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *Realizar un programa que muestre los 100 primeros numeros naturales.
 * @author VESPERTINO
 */
public class Ejercicio_switch_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x, m, c, d, d2, u;
        
        System.out.print("Introduce una numero entero entre -9.999 y 9.999: ");
        x = sc.nextInt();
        
        if((x > -10000) && (x < 10000)){
            m = x / 1000;
            c = (x % 1000) / 100;
            d = (x % 100) / 10;
            u = (x % 10);
            d2 =(d * 10) + u;
            if(x == 0){
                System.out.println("cero");
            }
            else{
                if(x < 0){
                    System.out.print("menos");
                }
                switch(m){
                    case 1: case -1:
                        System.out.print(" mil");
                        break;
                    case 2: case -2:
                        System.out.print(" dos mil");
                        break;
                    case 3: case -3:
                        System.out.print(" tres mil");
                        break;
                    case 4: case -4:
                        System.out.print(" cuatro mil");
                        break;
                    case 5: case -5:
                        System.out.print(" cinco mil");
                        break;
                    case 6: case -6:
                        System.out.print(" seis mil");
                        break;
                    case 7: case -7:
                        System.out.print(" siete mil");
                        break;
                    case 8: case -8:
                        System.out.print(" ocho mil");
                        break;  
                    case 9: case -9:
                        System.out.print(" nueve mil");
                        break;
                }
                switch(c){
                    case 1: case -1:
                        System.out.print(" cien");
                        break;
                    case 2: case -2:
                        System.out.print(" doscientos");
                        break;
                    case 3: case -3:
                        System.out.print(" trescientos");
                        break;
                    case 4: case -4:
                        System.out.print(" cuatrocientos");
                        break;
                    case 5: case -5:
                        System.out.print(" quinientos");
                        break;
                    case 6: case -6:
                        System.out.print(" seiscientos");
                        break;
                    case 7: case -7:
                        System.out.print(" setecientos");
                        break;
                    case 8: case -8:
                        System.out.print(" ochocientos");
                        break;  
                    case 9: case -9:
                        System.out.print(" novecientos");
                        break;
                }
                if(((d2 > 10) && (d2 < 30)) || ((d2 > -30) && (d2 < -10))){
                    switch(d2){
                        case 11: case -11:
                            System.out.println(" once");
                            break;
                        case 12: case -12:
                            System.out.println(" doce");
                            break;
                        case 13: case -13:
                            System.out.println(" trece");
                            break;
                        case 14: case -14:
                            System.out.println(" catorce");
                            break;
                        case 15: case -15:
                            System.out.println(" quince");
                            break;
                        case 16: case -16:
                            System.out.println(" dieciseis");
                            break;
                        case 17: case -17:
                            System.out.println(" diecisiete");
                            break;
                        case 18: case -18:
                            System.out.println(" dieciocho");
                            break;
                        case 19: case -19:
                            System.out.println(" diecinueve");
                            break;
                        case 20: case -20:
                            System.out.println(" veinte");
                            break;
                        case 21: case -21:
                            System.out.println(" veintiuno");
                            break;
                        case 22: case -22:
                            System.out.println(" veintidos");
                            break;
                        case 23: case -23:
                            System.out.println(" veintitres");
                            break;  
                        case 24: case -24:
                            System.out.println(" veinticuatro");
                            break;
                        case 25: case -25:
                            System.out.println(" veinticinco");
                            break;  
                        case 26: case -26:
                            System.out.println(" veintiseis");
                            break;
                        case 27: case -27:
                            System.out.println(" veintisiete");
                            break;
                        case 28: case -28:
                            System.out.println(" veintiocho");
                            break;  
                        case 29: case -29:
                            System.out.println(" veintinueve");
                            break;
                    }
                }
                else{
                    switch(d){
                        case 1: case -1:
                            System.out.print(" diez");
                            break;
                        case 2: case -2:
                            System.out.print(" veinte");
                            break;
                        case 3: case -3:
                            System.out.print(" teinta");
                            break;
                        case 4: case -4:
                            System.out.print(" cuatenta");
                            break;
                        case 5: case -5:
                            System.out.print(" cincuenta");
                            break;
                        case 6: case -6:
                            System.out.print(" sesenta");
                            break;
                        case 7: case -7:
                            System.out.print(" setenta");
                            break;
                        case 8: case -8:
                            System.out.print(" ochenta");
                            break;  
                        case 9: case -9:
                            System.out.print(" noventa");
                            break;
                    }
                    if(d != 0){
                        switch(u){
                            case 1: case -1:
                                System.out.println(" y uno");
                                break;
                            case 2: case -2:
                                System.out.println(" y dos");
                                break;
                            case 3: case -3:
                                System.out.println(" y tres");
                                break;
                            case 4: case -4:
                                System.out.println(" y cuatro");
                                break;
                            case 5: case -5:
                                System.out.println(" y cinco");
                                break;
                            case 6: case -6:
                                System.out.println(" y seis");
                                break;
                            case 7: case -7:
                                System.out.println(" y siete");
                                break;
                            case 8: case -8:
                                System.out.println(" y ocho");
                                break;  
                            case 9: case -9:
                                System.out.println(" y nueve");
                                break;
                        }
                    }
                    else{
                        switch(u){
                            case 1: case -1:
                                System.out.println(" uno");
                                break;
                            case 2: case -2:
                                System.out.println(" dos");
                                break;
                            case 3: case -3:
                                System.out.println(" tres");
                                break;
                            case 4: case -4:
                                System.out.println(" cuatro");
                                break;
                            case 5: case -5:
                                System.out.println(" cinco");
                                break;
                            case 6: case -6:
                                System.out.println(" seis");
                                break;
                            case 7: case -7:
                                System.out.println(" siete");
                                break;
                            case 8: case -8:
                                System.out.println(" ocho");
                                break;  
                            case 9: case -9:
                                System.out.println(" nueve");
                                break;
                        }
                    }
                }
            }
        }
        else{
            System.out.println("El numero introducido no esta dentro del rango.");
        }
    }
}

 