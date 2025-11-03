package org.nullp;

public class CloudLogger implements  Logger{

    @Override
    public void log(String message) {
        System.out.println(String.format("Logging >> %s To Cloud", message));
    }

}
