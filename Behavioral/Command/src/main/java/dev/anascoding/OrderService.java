package dev.anascoding;

import java.util.UUID;

public class OrderService
{
    public void cancelOrder(UUID orderId)
    {
        System.out.println("Cancel Order Logic Here for " + orderId);
    }

    public void createOrder(UUID orderId)
    {
        System.out.println("Create Order Logic Here for " + orderId);
    }
}
