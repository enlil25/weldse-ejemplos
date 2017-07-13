/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos2;

import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author cesar
 */
public class Game implements Serializable{
    
    @Inject @MaxNumber
    private int maxNumber;
    
    @Inject @Random
    private int aleatorio;
    
    public void jugar(){
        System.out.println("Numero aleatorio:"+aleatorio);
        System.out.println("Numero Maximo:"+maxNumber);
    }
}
