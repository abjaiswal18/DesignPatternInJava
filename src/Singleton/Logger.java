/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author HP
 */
public class Logger {
    
    //static methods can only use static variable to make it static also
    private static Logger logger;
    
    //private is used so that it cann't be called to TestLogger
    private Logger(){
        
    }
    
    //we will call the method but with obejct so used static
    public static Logger getInstance(){
        
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
    
}
