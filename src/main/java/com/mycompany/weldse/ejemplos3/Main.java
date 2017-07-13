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
public class Main {
    
    public static void main(String[] args) {
        CdiContext context = CdiContext.INSTANCE;
        Saludo saludo = context.getBean(Saludo.class);
        String s = saludo.saludar("jose");
        System.out.println(s);
        context.shutdown();
    }
}
