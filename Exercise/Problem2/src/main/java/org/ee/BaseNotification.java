package org.ee;

public class BaseNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Sending Notifications");
    }
}
