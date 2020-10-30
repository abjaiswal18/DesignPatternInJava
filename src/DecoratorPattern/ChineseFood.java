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
public class ChineseFood extends FoodDecorator{
    
    public ChineseFood(Food newFood) {
        super(newFood);
    }
    
    public String prepareFood(){
        return super.prepareFood()+"With Chowmein";
    }
    
    public double foodPrice(){
        return super.foodPrice()+100;
    }
}
