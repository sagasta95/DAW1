/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.fracciones;

/**
 *
 * @author VESPERTINO
 */
public class Fraccion {

    int num, dem;

    public Fraccion() {
        num = 0;
        dem = 0;
    }

    public Fraccion(int pnum, int pdem) {
        num = pnum;
        dem = pdem;
    }

    public void setNum(int pnum) {
        num = pnum;
    }

    public void setDem(int pdem) {
        dem = pdem;
    }
    public void setRacional (int a, int b){
        num = a;
        dem = b;
    }
    public int getNum() {
        return num;
    }

    public int getDem() {
        return dem;
    }

    public Fraccion suma(Fraccion f) {
        Fraccion aux = new Fraccion();
        int n, d;

        if (dem == f.getDem()) {
            n = num + dem;
            d = dem;
            aux.setNum(n);
            aux.setDem(d);
            return aux;
        } else {
            n = num * f.getDem() + dem * f.getNum();
            d = dem * f.getDem();
            aux.setNum(n);
            aux.setDem(d);
            return aux;
        }
    }    
    public Fraccion resta(Fraccion f){
        Fraccion aux = new Fraccion();
        int n, d;
        
        if (dem == f.getDem()) {
            n = num - dem;
            d = dem;
            aux.setNum(n);
            aux.setDem(d);
            return aux;
        } else {
            n = num * f.getDem() - dem * f.getNum();
            d = dem * f.getDem();
            aux.setNum(n);
            aux.setDem(d);
            return aux;
        }
    }    
    public Fraccion mult(Fraccion f){
        Fraccion aux = new Fraccion();
        int n, d;
        
        n = num * f.getNum();
        d = dem * f.getDem();
        aux.setNum(n);
        aux.setDem(d);
        return aux;
    }
    public Fraccion div(Fraccion f){
        Fraccion aux = new Fraccion();
        int n, d;
        
        n = num * f.getDem();
        d = dem * f.getNum();
        aux.setNum(n);
        aux.setDem(d);
        return aux;
    }
    public boolean comparacion (Fraccion f){
        int a, b;
        
        a = f.getNum()/ num;
        b = f.getDem()/ dem;
        
        if (a==b){
            System.out.println("La fraccion son iguales");
            return true;
        }
        else{
            System.out.println("La fraccion no son iguales");
            return false;
        }
    }   
    public Fraccion copia(Fraccion f){           
        Fraccion aux = new Fraccion();
        aux = f;
        return aux;
    }
    
    public void print(){
        System.out.println(num + "\n------\n" + dem);
    }
}
