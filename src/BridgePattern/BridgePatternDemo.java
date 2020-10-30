/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgePattern;

/**
 *
 * @author HP
 */
public class BridgePatternDemo {
    
    public static void main(String agr[]){
        Shape redCircle = new Circle(100,100,10, new RedCircle());
        Shape greenCircle = new Circle(50,80,10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
    
}
