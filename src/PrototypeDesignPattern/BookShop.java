/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class BookShop implements Cloneable{
    
    private String ShopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setShopName(String name) {
        this.ShopName = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void loadData(){
        for(int i = 1;i<10;i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book"+i);
            books.add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" + "name=" + ShopName + ", books=" + books + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Gives shallow cloning(1object 2 references,change in one lead to change in other)
//        return super.clone(); //To change body of generated methods, choose Tools | Templates.
        
        //Deep cloning(2 different objects
        BookShop shop = new BookShop();
        
        for(Book b : getBooks()){
            shop.getBooks().add(b);
        }
        return shop;
    }
    
    
     
}
