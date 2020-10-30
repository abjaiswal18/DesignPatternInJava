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
public class VegFood implements Food{

    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public double foodPrice() {
        return 50;
    }
    
}
