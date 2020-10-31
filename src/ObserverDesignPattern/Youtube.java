/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverDesignPattern;

/**
 *
 * @author HP
 */
public class Youtube {
    
    public static void main(String agr[]){
    
    Channel ob = new Channel();
    
    Subscriber s1 = new Subscriber("Akash");
    Subscriber s2 = new Subscriber("Sonam");
    Subscriber s3 = new Subscriber("Harsh");
    Subscriber s4 = new Subscriber("Kiara");
    Subscriber s5 = new Subscriber("Prips");
    ob.subscribe(s1);
    ob.subscribe(s2);
    ob.subscribe(s3);
    ob.subscribe(s4);
    ob.subscribe(s5);
    
    ob.unSubscribe(s3);
    
    s1.subscribeChannel(ob);
    s2.subscribeChannel(ob);
    s3.subscribeChannel(ob);
    s4.subscribeChannel(ob);
    s5.subscribeChannel(ob);
    
    ob.upload("WHat up");
    
    }
}

