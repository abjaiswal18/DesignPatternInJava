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
import java.util.*;
public class Test {
    
    public static void main(String arg[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        double num1 = input.nextDouble();
        
        System.out.println("Enter second Number");
        double num2 = input.nextDouble();
        
        System.out.println("Enter type of calculation required");
        CalculateFactory factory = new CalculateFactory();
        Calculate obj = factory.getCalculation(input.next());
        obj.calculate(num1,num2);
    }
    
}
