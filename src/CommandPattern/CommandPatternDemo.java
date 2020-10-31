/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author HP
 */
public class CommandPatternDemo {
    
    public static void main(String arg[]){
        Stock abcStock = new Stock();
        
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellsStockOrder = new SellStock(abcStock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellsStockOrder);
        
        broker.placeOrders();
    }
    
}