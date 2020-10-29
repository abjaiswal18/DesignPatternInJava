/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author HP
 */
public class AbstractFactoryPatternDemo {
    
    public static void main(String ag[]){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        
        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        
        Color color1 = colorFactory.getColor("Red");
        color1.fill();
        
        Color color2 = colorFactory.getColor("Green");
        color2.fill();
        
    }
}
