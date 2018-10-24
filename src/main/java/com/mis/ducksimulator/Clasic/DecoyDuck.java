/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.ducksimulator.Clasic;

/**
 *
 * @author admin
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
    }

    @Override
    public void quack() throws Exception{
        throw new Exception("I can not quack");        
    }    
}
