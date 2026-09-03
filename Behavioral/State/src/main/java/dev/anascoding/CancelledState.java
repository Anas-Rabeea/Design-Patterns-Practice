package dev.anascoding;

public class CancelledState implements OrderState
{
    @Override
    public void pay(Order order)
    {

    }

    @Override
    public void cancel(Order order)
    {

    }

    @Override
    public void ship(Order order)
    {

    }
}
