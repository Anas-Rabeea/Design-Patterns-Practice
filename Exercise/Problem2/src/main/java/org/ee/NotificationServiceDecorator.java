package org.ee;

public abstract class NotificationServiceDecorator implements NotificationService
{

        protected  final NotificationService service;

    public NotificationServiceDecorator(NotificationService service) {
        this.service = service;
    }

    @Override
    public void sendNotification() {
        // will always run
        service.sendNotification();
    }
}
