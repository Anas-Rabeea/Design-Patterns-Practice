package dev.anascoding;
//
//    Order
//     ↓
//    PendingState
//     ↓ pay()
//    Order
//     ↓
//    PaidState
//     ↓ ship()
//    Order
//     ↓
//    ShippedState

public interface OrderState
{
    // Each state owns its behavior.
    void pay(Order order);
    void cancel(Order order);
    void ship(Order order);

}
