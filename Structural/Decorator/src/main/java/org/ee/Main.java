package org.ee;


public class Main {
    public static void main(String[] args)
    {
        // Client
        Notification notification =
                new SecurityDecorator(new LoggingDecorator(new BasicNotification()));
        notification.send();
    }
}