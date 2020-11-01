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
public abstract class DataProcessor {
    
    public abstract void readData();
    public abstract void processData();
    public abstract void saveData();
    public void readProcessandSave(){
        readData();
        processData();
        saveData();
    }
    
    
}
