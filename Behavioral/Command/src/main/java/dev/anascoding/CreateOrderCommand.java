package dev.anascoding;

import java.util.UUID;

public class CreateOrderCommand implements Command
{
    private final OrderService orderService;
    private final UUID orderId;

    public CreateOrderCommand(OrderService orderService, UUID orderId)
    {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    // now the command doesnt know the actual logic for creating an order
    @Override
    public void execute()
    {
        orderService.createOrder(orderId);
        System.out.println("Creating Order");
    }
}
