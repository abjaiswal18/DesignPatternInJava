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
public class Book {

    private int bid;
    private String bname;
    
    public int getBid(){
        return bid;
    }
    
    public void setBid(int Bid){
        this.bid = Bid;
    }
    
    public String getBname(){
        return bname;
    }
    
    public void setBname(String bname){
        this.bname = bname;
    }
    
    @Override
    public String toString() {
        return "Book{" + "bid=" + bid + ", bname=" + bname + '}';
    }
    
}
