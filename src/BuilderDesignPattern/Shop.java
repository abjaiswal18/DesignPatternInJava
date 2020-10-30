/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderDesignPattern;

/**
 *
 * @author HP
 */
public class Shop {
    
    public static void main(String a[]){
        
        //getting a phone without mentioning all the sequence of constructor and setting the value which we want only
        //Builder Design Pattern
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        
       System.out.println(p);
    }
    
}
