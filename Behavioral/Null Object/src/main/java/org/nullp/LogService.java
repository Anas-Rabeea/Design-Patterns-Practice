package org.nullp;

public class LogService {

    private Logger logger ;

    public void setLogger(Logger logger)
    {
         this.logger = logger;
    }

    public void logging(String message)
    {
        logger.log(message);
    }


}
