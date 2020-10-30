/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author HP
 */
public class DecoratorCustomer {
    
    public static void main(String arg[]){
        VegFood v = new VegFood();
        System.out.println(v.prepareFood());
        System.out.println(v.foodPrice());
        
        Food f1 = new NonVegFood(new VegFood());
        System.out.println(f1.prepareFood());
        System.out.println(f1.foodPrice());
        
        Food f2 = new ChineseFood(new VegFood());
        System.out.println(f2.prepareFood());
        System.out.println(f2.foodPrice());
    }
}
