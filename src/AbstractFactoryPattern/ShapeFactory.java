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
public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equals("square")){
            return new Square();
        }else if(shapeType.equals("rectangle")){
            return new Rectangle();
        }
        return null;
    }
    
}
