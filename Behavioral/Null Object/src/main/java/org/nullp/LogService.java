package org.nullp;

public class LogService {

    private Logger logger ;

    public Logger setLogger(Logger logger)
    {
        return this.logger = logger;
    }

    public void logging(String message)
    {
        logger.log(message);
    }


}
