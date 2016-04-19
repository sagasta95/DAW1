/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class HombreDelTiempo {

    public static void main(String[] args) {
        int mes, enero = 0, febrero = 0, marzo = 0, abril = 0, mayo = 0, junio = 0,
                julio = 0, agosto = 0, septiembre = 0, octubre = 0, noviembre = 0, diciembre = 0,
                temperatura, medEne = 0, medFeb = 0, medMar = 0, medAbri = 0, medMay = 0, medJun = 0,
                medJuli = 0, medAgos = 0, medSept = 0, medOct = 0, medNov = 0, medDic = 0;
        String fecha, menu=null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Mete la fecha (dd/mm/aaaa): ");
            fecha = sc.nextLine();
            String[] token = fecha.split("/");
            mes = Integer.parseInt(token[1]);
            System.out.print("Pasame la temperatura : ");
            temperatura = sc.nextInt();
            switch (mes) {
                case 1:
                    medEne = medEne + temperatura;
                    enero++;
                    break;
                case 2:
                    medFeb = medFeb + temperatura;
                    febrero++;
                    break;
                case 3:
                    medMar = medMar + temperatura;
                    marzo++;
                    break;
                case 4:
                    medAbri = medAbri + temperatura;
                    abril++;
                    break;
                case 5:
                    medMay = medMay + temperatura;
                    mayo++;
                    break;
                case 6:
                    medJun = medJun + temperatura;
                    junio++;
                    break;
                case 7:
                    medJuli = medJuli + temperatura;
                    julio++;
                    break;
                case 8:
                    medAgos = medAgos + temperatura;
                    agosto++;
                    break;
                case 9:
                    medAgos = medAgos + temperatura;
                    agosto++;
                    break;
                case 10:
                    medOct = medOct + temperatura;
                    octubre++;
                    break;
                case 11:
                    medNov = medNov + temperatura;
                    noviembre++;
                    break;
                case 12:
                    medDic = medDic + temperatura;
                    diciembre++;
                    break;
                default:
                    break;
            }
            sc.nextLine();
            System.out.println("¿Desea introducir otro fecha? s/n");
            menu = sc.nextLine();
        } while(!menu.equals("n"));
        
        
        if (enero > 0) {
            System.out.println("Enero " + (medEne / enero));
        } else {
            System.out.println("Enero");
        }
        if (febrero > 0) {
            System.out.println("Febrero " + (medFeb / febrero));
        } else {
            System.out.println("Febrero");
        }
        if (marzo > 0) {
            System.out.println("Marzo " + (medMar / marzo));
        } else {
            System.out.println("Marzo");
        }
        if (abril > 0) {
            System.out.println("Abril " + (medAbri / abril));
        } else {
            System.out.println("Abril");
        }
        if (mayo > 0) {
            System.out.println("Mayo " + (medMay / mayo));
        } else {
            System.out.println("Mayo");
        }
        if (junio > 0) {
            System.out.println("Junio " + (medJun / junio));
        } else {
            System.out.println("Junio");
        }
        if (julio > 0) {
            System.out.println("Julio " + (medJuli / julio));
        } else {
            System.out.println("Julio");
        }
        if (agosto > 0) {
            System.out.println("Agosto " + (medAgos / agosto));
        } else {
            System.out.println("Agosto");
        }
        if (septiembre > 0) {
            System.out.println("Septiembre " + (medSept / septiembre));
        } else {
            System.out.println("Septiembre");
        }
        if (octubre > 0) {
            System.out.println("Octubre " + (medOct / octubre));
        } else {
            System.out.println("Octubre");
        }
        if (noviembre > 0) {
            System.out.println("Noviembre " + (medNov / noviembre));
        } else {
            System.out.println("Noviembre");
        }
        if (diciembre > 0) {
            System.out.println("Diciembre: " + (medDic / diciembre));
        } else {
            System.out.println("Diciembre");
        }

    }
}
