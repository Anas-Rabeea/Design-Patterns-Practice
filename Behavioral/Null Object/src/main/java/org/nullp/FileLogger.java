package org.nullp;

public class FileLogger implements  Logger{

    @Override
    public void log(String message) {
        System.out.println(String.format("Logging >> %s To File", message));
    }

}
