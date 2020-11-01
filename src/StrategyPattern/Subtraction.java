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
public class Subtraction implements Strategy{

    @Override
    public float calculation(float a, float b) {
        return a-b;
    }
    
}
