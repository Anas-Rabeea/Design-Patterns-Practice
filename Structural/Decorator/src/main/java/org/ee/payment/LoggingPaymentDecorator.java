package org.ee.payment;

public class LoggingPaymentDecorator extends PaymentServiceDecorator
{
    // so now we can inject a decorator or an implementation as they all implement PaymentService
    public LoggingPaymentDecorator(PaymentService paymentService)
    {
        super(paymentService);
    }

    @Override
    public void pay(Payment payment)
    {
        System.out.println("-- Starting Logging ---" );

        System.out.println("Start Payment..." );
        paymentService.pay(payment);
        System.out.println("End Payment..." );
    }
}
