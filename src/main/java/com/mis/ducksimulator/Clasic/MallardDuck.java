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
public class MallardDuck  implements Quackable,Duck{

    private MallarFlyBehavior flyBehavior;
    
    public MallardDuck() {
        this.flyBehavior = new MallarFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm MallarDuck");
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
    
}
