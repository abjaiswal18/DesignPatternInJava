/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

/**
 *
 * @author HP
 */
public class TemplateDemo {
    
    public static void main(String agr[]){
        ExcelFile obj = new ExcelFile();
        obj.readProcessandSave();
        
        TextFile obj2 = new TextFile();
        obj2.readProcessandSave();
        
    }
    
}
