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
public class RedHeadDuck  implements Flyable, Quackable, Duck{

    public RedHeadDuck() {
    }

    @Override
    public void display() {
        System.out.println("I'm RedHeadDuck");
    }

    @Override
    public void fly() {
        System.out.println("RedheadDuck Fly");
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
