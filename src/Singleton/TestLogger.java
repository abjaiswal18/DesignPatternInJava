/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author HP
 */
public class TestLogger {
    
    public static void main(String args[]){
        
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();
        
        //hashcode will be same
        System.out.println("Singleton");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        
        TestLogger obj3 = new TestLogger();
        TestLogger obj4 = new TestLogger();
        
        //hashcode will be different
        System.out.println("Non-Singleton");
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
        
    }
}
