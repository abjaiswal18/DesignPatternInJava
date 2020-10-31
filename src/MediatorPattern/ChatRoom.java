/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern;

import java.util.Date;

/**
 *
 * @author HP
 */
public class ChatRoom {
    
    public static void showMessage(User user, String msg){
        System.out.println(new Date().toString()+" "+user.getName()+" "+msg);
    }
}
