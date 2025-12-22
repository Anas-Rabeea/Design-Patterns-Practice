package org.ee;

public abstract class NotificationDecorator implements Notification{

    protected final Notification notification;

    protected NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        notification.send();

    }
}
