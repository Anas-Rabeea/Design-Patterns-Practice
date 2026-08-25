package org.ee.payment;

public class PaypalPaymentService implements PaymentService
{
    @Override
    public void pay(Payment payment)
    {
        System.out.println("Processing PAypal Payment");
    }
}
