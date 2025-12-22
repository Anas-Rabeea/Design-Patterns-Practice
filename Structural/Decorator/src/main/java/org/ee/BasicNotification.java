package org.ee;

public class BasicNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Sending A notification.");
    }
}
