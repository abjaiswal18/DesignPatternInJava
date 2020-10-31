/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern;

/**
 *
 * @author HP
 */
public class MediatorPatternDemo {
    
    public static void main(String agr[]){
        User rohan = new User("Rohan");
        User John = new User("John");
        
        rohan.sendMessage("Hi");
        John.sendMessage("Hello");
        
    }
}
