/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author cesar
 */
public class Principal {

    public static void main(String[] args) {

        //instanciamos WELD
        // Weld weld = new Weld();
        // WeldContainer container = weld.initialize();
        // Proyecto miproyecto = container.select(Proyecto.class).get();
        // System.out.println(miproyecto.toString());
        
        
        //Weld weld = new Weld();
        //WeldContainer container = weld.initialize();
        //ProductorEventos productor = container.select(ProductorEventos.class).get();
        //productor.dispararEvento();
        
        //weld.shutdown();
        
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        NumberGenerator generator = container.select(NumberGenerator.class).get();
        System.out.println("Numero generado:"+generator.generarNumero());
        weld.shutdown();
    }
}
