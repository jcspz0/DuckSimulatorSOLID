/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.ducksimulator;

import com.mis.ducksimulator.Clasic.Duck;
import com.mis.ducksimulator.Clasic.MallardDuck;
import com.mis.ducksimulator.Clasic.RedHeadDuck;
import com.mis.ducksimulator.Clasic.RubberDuck;

/**
 *
 * @author admin
 */
public class DuckClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Duck();
        MallardDuck mallarDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        
        duck.display();
        redHeadDuck.display();
        mallarDuck.display();
        
        rubberDuck.fly();
        
    }
    
}
