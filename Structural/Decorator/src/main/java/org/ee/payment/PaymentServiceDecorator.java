package org.ee.payment;

public abstract class PaymentServiceDecorator implements PaymentService
{
    // The decorator contains another component of the same abstraction.
    protected final PaymentService paymentService;

    protected PaymentServiceDecorator(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }
}
