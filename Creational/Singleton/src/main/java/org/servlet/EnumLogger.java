package org.servlet;

public enum EnumLogger {
    //  Thread-safe  & Serialization safe
    INSTANCE;  // an only one instance of the class

    public void log(String message) {
        System.out.println("[EnumLogger] " + message);
    }

}
