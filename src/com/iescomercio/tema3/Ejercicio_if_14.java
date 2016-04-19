/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con
 * meses de 28, 30 y 31 días. Sin años bisiestos.
 *
 * @author Ángel
 */
public class Ejercicio_if_14 {

    public static void main(String[] args) {
        int dia, mes, ano;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Pasame el dia: ");
            dia = sc.nextInt();
            if (dia <= 0 || dia > 31) {
                System.out.println("La fecha del dia no es correcta introduzcala bien");
            }
        } while (dia <= 0 || dia > 31);

        do {
            System.out.println("Pasame el mes: ");
            mes = sc.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("El mes introducido no es correcto introduzcala bien");
            }
        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Pasame el año: ");
            ano = sc.nextInt();
            if (ano <=1000 || ano>3000) {
                System.out.println("Mete un año que sea correcto");
            }
        } while (ano <=1000 || ano>3000);
        
        if (mes == 1) {
            if (dia > 0 && dia <= 31) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 2) {
            if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
                if (dia > 0 && dia <= 29) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta");
                }
            } else if (ano % 100 != 0) {
                if (dia > 0 && dia <= 29) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta");
                }
            } else {
                if (dia > 0 && dia <= 28) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta");
                }
            }
        } else if (mes == 3) {
            if (dia > 0 && dia <= 31) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 4) {
            if (dia > 0 && dia <= 30) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 5) {
            if (dia > 0 && dia <= 31) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 6) {
            if (dia > 0 && dia <= 30) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 7) {
            if (dia > 0 && dia <= 31) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 8) {
            if (dia > 0 && dia <= 31) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 9) {
            if (dia > 0 && dia <= 30) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 10) {
            if (dia > 0 && dia <= 31) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 11) {
            if (dia > 0 && dia <= 30) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        } else if (mes == 12) {
            if (dia > 0 && dia <= 31) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha es incorrecta");
            }
        }
    }
}
