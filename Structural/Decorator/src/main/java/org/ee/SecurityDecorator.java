package org.ee;

public class SecurityDecorator extends NotificationDecorator{

    public SecurityDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public void send() {
        System.out.println("Security Check");
        super.send();
    }
}
