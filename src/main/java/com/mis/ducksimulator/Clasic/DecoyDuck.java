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
public class DecoyDuck implements Duck{

    public DecoyDuck() {
    }

    @Override
    public void display() {
        System.out.println("I'm decoyDuck");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    
    
}
