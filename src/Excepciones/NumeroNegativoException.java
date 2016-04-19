/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author VESPERTINO
 */
public class NumeroNegativoException extends Exception{

    public NumeroNegativoException() {
    }
    
    @Override
    public String getMessage() {
        return "El valor no puede ser negativo";
    }

}
