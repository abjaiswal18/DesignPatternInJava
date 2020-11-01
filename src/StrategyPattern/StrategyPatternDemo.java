/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author HP
 */
public class StrategyPatternDemo {
    
    public static void main(String arg[]){
        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(10, 20));  
  
        context = new Context(new Subtraction());       
        System.out.println("Subtraction = " + context.executeStrategy(15, 20));  
  
        context = new Context(new Multiplication());        
        System.out.println("Multiplication = " + context.executeStrategy(15, 12));  
    }
    
}
