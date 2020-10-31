/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author HP
 */
public class StatePatternDemo {
    
    public static void main(String agr[]){
        Context context = new Context();
        
        StartState startState = new StartState();
        startState.doAction(context);
        
        System.out.println(context.getState().toString());
        
        StopState stopState = new StopState();
        stopState.doAction(context);
        
        System.out.println(context.getState().toString());
    }
    
}
