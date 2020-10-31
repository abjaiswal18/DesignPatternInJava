/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Channel {
    
    private List<Subscriber> subs = new ArrayList<>();
    private String title;
    
    public void subscribe(Subscriber sub){
        
        subs.add(sub);
    }
    
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }
    
    public void notifySubscriber(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }
    
    public void upload(String title){
        this.title = title;
        notifySubscriber();
    }
}
