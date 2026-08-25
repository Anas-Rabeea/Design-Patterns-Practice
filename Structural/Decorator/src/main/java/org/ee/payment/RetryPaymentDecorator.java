package org.ee.payment;

public class RetryPaymentDecorator extends PaymentServiceDecorator
{
    private final int maxRetries;

    public RetryPaymentDecorator(PaymentService paymentService, int maxRetries)
    {
        super(paymentService);
        this.maxRetries = maxRetries;
    }

    @Override
    public void pay(Payment payment)
    {
        System.out.println("In Retry Payment Decorator .pay()");
        for ( int i = 1; i <= maxRetries; i++ )
        {
            try
            {
                paymentService.pay(payment);
                return;
            }
            catch (Exception e)
            {
                if (i == maxRetries) throw e;
            }
        }
    }
}
