package org.ee;

public class LoggingNotification extends NotificationServiceDecorator{


    public LoggingNotification(NotificationService service) {
        super(service);
    }

    @Override
    public void sendNotification() {
        System.out.println("Logging Notification");
        super.sendNotification();
    }
}
