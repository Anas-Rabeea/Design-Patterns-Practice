package org.servlet;

public class EagerLogger {

    // Eager Initialization
    // Instance created even if never used
    private static EagerLogger instance  = new EagerLogger() ;

    private EagerLogger() {}


    public static EagerLogger getInstance()
    {
        return instance ;
    }

    public void log(String message)
    {
        System.out.println("Logging from only one intsance >> " + message);
    }


}
