package org.ee.order;

public class EmailNotificationConsumer implements OrderPlacementObserver
{
    @Override
    public void onOrderPlaced(OrderPlacementEvent event)
    {
        System.out.println("Email Notification sent to --> " + event.buyer());
    }
}
