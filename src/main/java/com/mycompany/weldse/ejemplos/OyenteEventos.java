/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos;

import javax.enterprise.event.Observes;

/**
 *
 * @author cesar
 */
public class OyenteEventos {
    
    
    public void oyenteEvento1(@Observes String saludo){
        System.out.println("Evento recibido:"+saludo);
    }
}
