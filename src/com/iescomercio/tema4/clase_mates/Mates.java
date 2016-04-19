/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.clase_mates;

/**
 *
 * @author VESPERTINO
 */
public class Mates {
    
    private int n;
    
    public Mates(int n){
        this.n = n;
    }
    
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return n;
    }
    
    public boolean esPerfecto(){
        
        int suma=0, c=1;
        
        while(n != c){
            if((n % c) == 0)
                suma = suma + c;
            c++;
        }
        if(suma == n){
            System.out.println(suma);
            return true;
        }
        else{
            System.out.println(suma);
            return false;
        }
    }
    public boolean esPrimo(){
        
        int suma=0, c=1;
        
        while(n >= c){
            if((n % c) == 0)
                suma = suma + c;
            c++;
        }
        if(suma == n + 1){
            System.out.println(suma);
            return true;
        }
        else{
            System.out.println(suma);
            return false;
        }
    }
    public void listaPerfectos(){
        
        int suma=0, c=1, c2=2;
        
        while(n >= c2){
            while(c2 % c == 0){
                
            }
            if(suma == c2)
                System.out.print(c2 + " ");
            c2++;
        }
    }
}
