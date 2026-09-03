package dev.anascoding;

public class PendingState implements OrderState
{
    @Override
    public void pay(Order order)
    {
        System.out.println("Order is Paid and transitioned state from pending to paid");
        order.setState(new PaidState());
    }

    @Override
    public void cancel(Order order)
    {
        // now cancelled.state.cancel() can run
        order.setState(new CancelledState());
    }

    @Override
    public void ship(Order order)
    {
        throw new IllegalArgumentException("Cant Ship Pending Order");
    }
}
