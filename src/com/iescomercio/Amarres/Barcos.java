/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.Amarres;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Barcos implements Serializable{

    private String matricula;
    private int m_eslora, año_fabricacion, cv, n_camarotes;

    public Barcos(String matricula, int año_fabricacion, int m_eslora, int cv, int n_camarotes){
        this.matricula = matricula;
        this.año_fabricacion = año_fabricacion;
        this.m_eslora = m_eslora;
        this.cv = cv;
        this.n_camarotes = n_camarotes;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getM_eslora() {
        return m_eslora;
    }

    public void setM_eslora(int m_eslora) {
        this.m_eslora = m_eslora;
    }

    public int getAño_fabricacion() {
        return año_fabricacion;
    }

    public void setAño_fabricacion(int año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getN_camarotes() {
        return n_camarotes;
    }

    public void setN_camarotes(int n_camarotes) {
        this.n_camarotes = n_camarotes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barcos other = (Barcos) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
}
