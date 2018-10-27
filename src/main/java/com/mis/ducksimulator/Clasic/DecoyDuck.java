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

    private SwimBehavior swimBehavior;
    
    public DecoyDuck() {
    }

    @Override
    public void display() {
        System.out.println("I'm decoyDuck");
    }

    
    public void swim() {
        this.swimBehavior = new SwimBehavior() {
            @Override
            public void swim() {
                System.out.println("decoy swim");
            }
        };
    }

    
    
}
