/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 *
 * @author cesar
 */
public class ProductorEventos {
    
    @Inject
    private Event<String> evento1;
    
    public void dispararEvento(){
        
        evento1.fire("Hola como estas");
    }
}
