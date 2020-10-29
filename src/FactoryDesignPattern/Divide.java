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
public class Divide implements Calculate{
    
    public void calculate(double a, double b){
        System.out.println("a/b is " +(a/b));
    }
    
}
