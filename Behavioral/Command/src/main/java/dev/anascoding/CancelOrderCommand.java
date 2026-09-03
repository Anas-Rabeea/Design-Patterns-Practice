package dev.anascoding;

import java.util.UUID;

// This object represents the request to cancel an order.
public class CancelOrderCommand implements Command
{
    private final OrderService orderService;
    private final UUID orderId;

    public CancelOrderCommand(OrderService orderService, UUID orderId)
    {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    @Override
    public void execute()
    {
        orderService.cancelOrder(orderId);
        System.out.println("Cancelling Order");
    }
}
