package org.ee;

public class Main {
    public static void main(String[] args) {
        // making notification System Using Decorator Pattern
        NotificationService service
                = new EncryptingNotification(
            new LoggingNotification(
                    new BaseNotification()
            )
        ) ;
        service.sendNotification();
    }
}