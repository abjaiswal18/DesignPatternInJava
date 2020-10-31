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
public class Subscriber {
    
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }
    
    public void update(){
        System.out.println(name+" Video Uploaded");
    }
    
    public void subscribeChannel(Channel ch){
        channel = ch;
    }
    
}
