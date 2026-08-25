package org.ee.payment;

public class StripePaymentService implements PaymentService
{
    @Override
    public void pay(Payment payment)
    {
        System.out.println("Processing Stripe Payment");
    }
}
