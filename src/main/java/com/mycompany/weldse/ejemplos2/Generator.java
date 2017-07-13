/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos2;

import java.io.Serializable;
import javax.enterprise.inject.Produces;

/**
 *
 * @author cesar
 */

public class Generator implements Serializable{
    
    private java.util.Random random  = new java.util.Random(System.currentTimeMillis());
   
    private int maxNumber = 100;
    
    public java.util.Random getRandom(){
        return random;
    }
    
    @Produces @Random 
    public int next(){
        return getRandom().nextInt(maxNumber);
    }
    
    @Produces @MaxNumber
    public int getMaxNumber(){
        return maxNumber;
    }
    
    

}
