/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author HP
 */
public class ChainOfResponsibilityClient {
    
    private static Logger doChaining(){
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);
        
        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);
        
        return consoleLogger;
    }  
    
    public static void main(String agr[]){
        Logger chainLogger = doChaining();
        
        chainLogger.logMessage(Logger.OUTPUTINFO,"Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");  
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");  
    }
    
    
}
