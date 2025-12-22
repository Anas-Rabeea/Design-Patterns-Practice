package org.ee;

public class LoggingDecorator extends NotificationDecorator{


    protected LoggingDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Logging");
        super.send();
    }
}
