/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern;

/**
 *
 * @author HP
 */
public class Demo {
    
    public static void main(String arg[]) throws CloneNotSupportedException {
        
        BookShop bs = new BookShop();
        bs.setShopName("Chandu");
        bs.loadData();
        
        
        BookShop bs1 = (BookShop)bs.clone();
        
        bs1.setShopName("Harsh");
        
        System.out.println(bs1);
        bs.getBooks().remove(2);
        System.out.println(bs);
        
        
    }
    
}

//Two type of cloning(used to copy data from 1 object to another)
//1. Shallow cloning
//2. Deep cloning 
