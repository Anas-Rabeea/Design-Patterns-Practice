package dev.anascoding;

// The Order knows its current state.
public class Order
{
    // default state
    private OrderState state = new PendingState();

    // Order.pay() behaves differently depending on the current state.
    // like pending.pay() is different from shipped.pay() and paid.pay()
    public void pay(Order oder)
    {
        state.pay(this);
    }

    public void cancel(Order oder)
    {
        state.cancel(this);
    }

    public void ship(Order oder)
    {
        state.ship(this);

    }


    public void setState(OrderState state)
    {
        this.state = state;
    }
}
