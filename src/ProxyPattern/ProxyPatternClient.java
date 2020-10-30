/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern;

/**
 *
 * @author HP
 */
public class ProxyPatternClient {
    
    public static void main(String args[]){
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");  
        access.grantInternetAccess();  
    }
    
}
