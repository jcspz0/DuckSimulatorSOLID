/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.ducksimulator;

import com.mis.ducksimulator.Clasic.DecoyDuck;
import com.mis.ducksimulator.Clasic.Duck;
import com.mis.ducksimulator.Clasic.MallardDuck;
import com.mis.ducksimulator.Clasic.RedHeadDuck;
import com.mis.ducksimulator.Clasic.RubberDuck;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DuckClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        
        Duck duckmallar = new MallardDuck();
        
        //MallarDuck
        mallarDuck.display();
        mallarDuck.swim();
//        mallarDuck.quack();
//        mallarDuck.fly();
        //redheadDuck
        redHeadDuck.display();
        redHeadDuck.swim();
//        redHeadDuck.quack();
//        redHeadDuck.fly();
        //rubberDuck
        rubberDuck.display();
        rubberDuck.swim();
//        rubberDuck.quack();
//        rubberDuck.fly();
        //decoyDuck
        decoyDuck.display();
        decoyDuck.swim();
//        decoyDuck.quack();
//        decoyDuck.fly();
        


        
        
        
        
        
        
        
        List<Duck> List = Arrays.asList(mallarDuck,redHeadDuck,redHeadDuck,redHeadDuck);
        for (Duck aDuck : List) {
            aDuck.swim();
        }
    }
    
}
