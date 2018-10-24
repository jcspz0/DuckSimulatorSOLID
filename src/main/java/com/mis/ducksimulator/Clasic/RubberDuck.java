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
public class RubberDuck extends Duck{

    public RubberDuck() {
    }

    @Override
    public void quack() {
        System.out.println("squike");
    }

    @Override
    public void display() {
        System.out.println("I'm RubberDuke");
    }

    @Override
    public void fly() throws Exception {
        throw new Exception("I can not fly");        
    }
    
    
    
}
