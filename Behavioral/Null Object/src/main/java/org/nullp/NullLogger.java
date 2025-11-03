package org.nullp;

public class NullLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Null Logger used");
    }
}
