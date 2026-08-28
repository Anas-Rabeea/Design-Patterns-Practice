package org.ee.order;

import java.util.ArrayList;
import java.util.List;

public class OrderEventPublisher
{
    // consumers == observers
    private final List<OrderPlacementObserver> consumers = new ArrayList<>();

    public void subscribe(OrderPlacementObserver consumer)
    {
        consumers.add(consumer);
    }

    // notify all observers/consumers
    public void publish(OrderPlacementEvent event)
    {
        for(OrderPlacementObserver consumer : consumers)
            consumer.onOrderPlaced(event);
    }


}
