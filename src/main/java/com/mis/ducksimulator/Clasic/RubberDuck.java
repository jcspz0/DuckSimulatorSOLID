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
public class RubberDuck  implements Duck{

    private QuackBehavior quackBehavior;
    private SwimBehavior swimBehavior;
    
    public RubberDuck() {
    }

    public void quack() {
        this.quackBehavior = new QuackBehavior() {
            @Override
            public void quack() {
                System.out.println("squick");
            }
        };
    }

    @Override
    public void display() {
        System.out.println("I'm RubberDuck");
    }

    
    public void swim() {
        this.swimBehavior = () -> {
            System.out.println("rubber swim");
        };
    }

    
    
    
    
}
