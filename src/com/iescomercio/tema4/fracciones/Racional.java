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
public class Racional {
    //Atributos
    private int numerador, denominador;
    
    //Constructores
    
    public Racional(){
        numerador=0;
        denominador=1;
    }
    public Racional (int a, int b){
        numerador = a;
        denominador =b;
    }
    //metodos
    public void setNumerador(int a){
        numerador=a;
    }
    public void setDenominador (int b){
        denominador=b;
    }
    public void setRacional (int a, int b){
        numerador = a;
        denominador = b;
    }
    public float calculaReal(){
        return (float)numerador/denominador;
    }
    
    public int getNumerador(){
        return numerador;
    }
    public int getDenominador(){
        return denominador;
    }
    public String print(){
        return "\n"+" "+numerador+"\n"+ "----"+"\n"+" "+denominador;
	}
    public boolean compara (Racional obj1){
        int a=obj1.getNumerador()/numerador;
        int b=obj1.getDenominador()/denominador;
        if (a==b){
            System.out.println("La fraccion son iguales");
            return true;
        }
        else{
            System.out.println("La fraccion no son iguales");
            return false;
        }
    }
    
    // Devuelve un objeto con las propiedades que tengo internamente
    public Racional copia(){           
            Racional aux;        
            aux = new Racional(numerador, denominador);                      
            return aux;
    }

    public Racional suma(Racional obj2){    
                 Racional aux = new Racional();                
                int b=obj2.getNumerador();  //ok
                int d=obj2.getDenominador();
                     if (denominador!=d){
                        aux.setNumerador((numerador*d)+(b*denominador));
                        aux.setDenominador(denominador*d);
                        return aux;
                     }
                     else{
                        aux.setNumerador (numerador+b);
                        aux.setDenominador (denominador);
                        return aux;
                    }
    }
    public Racional resta (Racional obj2){//ok
                Racional aux = new Racional();
	        int b= obj2.getNumerador();
		int d= obj2.getDenominador();
                 if (denominador!=d){
                    aux.setNumerador((b*denominador)-(numerador*d));
		    aux.setDenominador(denominador*d);
                    return aux;
                 }
                 else{
                    aux.setNumerador(b-numerador);
		    aux.setDenominador(denominador);              
                    return aux;
                 }
	}
	public Racional multiplicacion (Racional obj2){//ok
                Racional aux = new Racional();
		int b= obj2.getNumerador();
		int d= obj2.getDenominador();		
                aux. setNumerador(numerador*b);
                aux.setDenominador(denominador*d);
                return aux;
	}
	public Racional division (Racional obj2){ //ok
                Racional aux = new Racional();
                
		int b= obj2.getNumerador();
		int d= obj2.getDenominador();		
                
                aux.setNumerador(numerador*d);
		aux.setDenominador(denominador*b);
		return aux;
	}      
}

