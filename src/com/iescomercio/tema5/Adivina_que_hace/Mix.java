/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema5.Adivina_que_hace;

/**
 *
 * @author VESPERTINO
 */
public class Mix {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        
        b.m1();
        c.m2();
        a.m3();
        
        c.m1();
        c.m2();
        c.m3();
        
        a.m1();
        b.m2();
        c.m3();
        
        a2.m1();
        a2.m2();
        a2.m3();
        a2.notifyAll();
    }
}
