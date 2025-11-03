package org.nullp;


public class Main {
    public static void main(String[] args) {

    LogService logService = new LogService();

    logService.setLogger(new CloudLogger());
    logService.logging("Log the transaction");

        logService.setLogger(new NullLogger());
        logService.logging("This Message Will not be logged");


    }
}