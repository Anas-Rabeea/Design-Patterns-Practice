package org.ee.order;

public interface OrderPlacementObserver
{
    void onOrderPlaced(OrderPlacementEvent event);
}
