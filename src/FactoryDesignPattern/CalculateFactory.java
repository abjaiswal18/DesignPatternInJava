/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDesignPattern;

/**
 *
 * @author HP
 */
public class CalculateFactory {
    
    public Calculate getCalculation(String type){
        Calculate obj = null;
        
        if(type.equals("add")){
            obj = new Add();
        }
        else if(type.equals("subtract")){
            obj = new Subtract();
        }
        else if(type.equals("divide")){
            obj = new Divide();
        }
        else{
            System.out.println("We dont do that");
        }
        return obj;
    }
    
}
