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
public class ProxyInternetAccess implements OfficeInternetAccess{
    
    private String employeeName;
    private RealInternetAccess realAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    
    @Override
    public void grantInternetAccess() {
        
        if(getRole(employeeName)>4){
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        }
        else{
            System.out.println("No internet access granted");
        }
    }
    
    public int getRole(String empName){
         // Check role from the database based on Name and designation 
         //return job level 
         return (int)(Math.random()*10);
    }
}
