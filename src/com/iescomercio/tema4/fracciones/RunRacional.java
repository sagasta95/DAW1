/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.Tema4POO;

/**
 *
 * @author Ángel
 */
public class RunRacional {
    public static void main(String[] args) {
        Racional obj1 = new Racional(1,3);
        Racional obj2 = new Racional(5,3);//Estos son los valores quele entran a y b del metodo
        
        //comparacion
        boolean comparacion = obj1.compara(obj2);
        System.out.println("Son iguales las fracciones?: "+ comparacion );
        //suma
        Racional suma=obj1.suma(obj2);
        System.out.println("Resultado de la suma:  "+ suma.print());//no saca bien el resultado homogeneo
        //Resta
         Racional resta = obj1.resta(obj2);
        System.out.println("Resultado de la resta:  "+ resta.print());   
        //multiplicacion
        Racional multi = obj1.multiplicacion(obj2); 
        System.out.println("Resultado de la multiplicacion:  "+ multi.print());
        //Division
        Racional division = obj1.division(obj2);       
        System.out.println("Resultado de la division:  "+ division.print());
        //Calcular resultado de un fracción
        System.out.println("Resultado real de una fraccion: "+ obj1.calculaReal());
        //copiar una fraccion
        Racional cp2 = obj2.copia();
        System.out.println("Resultado de copia:  "+ cp2.print());    
    }
    
}
