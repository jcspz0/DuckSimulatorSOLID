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
public class MallardDuck  implements Duck{

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private SwimBehavior swimBehavior;
    
    public MallardDuck() {
    }

    @Override
    public void display() {
        System.out.println("I'm MallarDuck");
    }

    public void fly() {
        this.flyBehavior = new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("Mallard Fly");
            }
        };
    }

    public void quack() {
        this.quackBehavior = new QuackBehavior() {
            @Override
            public void quack() {
                System.out.println("Mallard quack");
            }
        };
    }

    
    public void swim() {
        this.swimBehavior = new SwimBehavior() {
            @Override
            public void swim() {
                System.out.println("Mallard swim");
            }
        };
    }
    
}
