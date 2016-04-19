/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema8.traduccion;

/**
 *
 * @author VESPERTINO
 */
public class Palabras {
    
    private String español, ingles, frances;



    public Palabras(String español, String ingles, String frances) {
        this.español = español;
        this.ingles = ingles;
        this.frances = frances;
        
    }

    public String getEspañol() {
        return español;
    }

    public void setEspañol(String español) {
        this.español = español;
    }
    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getFrances() {
        return frances;
    }

    public void setFrances(String frances) {
        this.frances = frances;
    }
    
}
