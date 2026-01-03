package org.ee;

public class EncryptingNotification extends NotificationServiceDecorator{


    public EncryptingNotification(NotificationService service) {
        super(service);
    }

    @Override
    public void sendNotification() {
        System.out.println("Encrypting Notification");
        super.sendNotification();
    }
}
