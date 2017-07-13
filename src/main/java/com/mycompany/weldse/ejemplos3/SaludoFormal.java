/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos3;

/**
 *
 * @author cesar
 */
public class SaludoFormal implements Saludo{

    @Override
    public String saludar(String name) {
      return "hola,buenos dias "+name;
    }
    
}
