/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos;

/**
 *
 * @author cesar
 */
@Nuevo
public class ISSNGenerator implements NumberGenerator{

    @Override
    public String generarNumero() {
      return "ISSN-202874";
    }
    
}
