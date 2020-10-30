/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterDesignPattern;

/**
 *
 * @author HP
 */
public class School {
    
    public static void main(String ar[]){
        
//        PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        Assisgnment aw = new Assisgnment();
        aw.setP(p);
        aw.writeAssignment("Little bit of tired");
        
    }
    
}
