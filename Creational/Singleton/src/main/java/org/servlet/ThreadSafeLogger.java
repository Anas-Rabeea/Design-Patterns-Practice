package org.servlet;

// LAZY INITIALIZATION ( Best / more used)
public class ThreadSafeLogger {

    private static  ThreadSafeLogger instace ;

    private  ThreadSafeLogger() {

    }

    public static  ThreadSafeLogger getInstance()
    {
        if (instace == null) {

            // locking to let only one thread access this block  {only one can initiate the instance}
            synchronized (ThreadSafeLogger.class) {

                if (instace == null) {
                    instace = new ThreadSafeLogger();
                }
            }

        }

        return instace;
    }

    public void log(String message)
    {
        System.out.println("Logging from only one intsance >> " + message);
    }



}
