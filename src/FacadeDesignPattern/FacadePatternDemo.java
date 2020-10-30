/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDesignPattern;

/**
 *
 * @author HP
 */
public class FacadePatternDemo {
    
    public static void main(String agr[]){
        ShapeMakerFacade shape = new ShapeMakerFacade();
        shape.drawCircle();
        shape.drawRectangle();
        shape.drawSquare();
    }
    
}
