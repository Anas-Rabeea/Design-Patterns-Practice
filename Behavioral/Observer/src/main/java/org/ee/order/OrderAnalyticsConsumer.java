package org.ee.order;

public class OrderAnalyticsConsumer implements OrderPlacementObserver
{
    @Override
    public void onOrderPlaced(OrderPlacementEvent event)
    {
        System.out.println("Analytics team reviewing " + event.toString());
    }
}
