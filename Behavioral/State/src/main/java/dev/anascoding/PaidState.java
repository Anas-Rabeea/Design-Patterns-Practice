package dev.anascoding;

public class PaidState implements OrderState
{
    @Override
    public void pay(Order order)
    {
        throw new IllegalArgumentException("Order is Already Paid and u can cancel or ship it");
    }

    @Override
    public void cancel(Order order)
    {
        order.setState(new CancelledState());
    }

    @Override
    public void ship(Order order)
    {
        order.setState(new ShippedState());
    }
}
