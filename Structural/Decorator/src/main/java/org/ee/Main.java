package org.ee;


import org.ee.payment.LoggingPaymentDecorator;
import org.ee.payment.Payment;
import org.ee.payment.PaymentService;
import org.ee.payment.PaypalPaymentService;
import org.ee.payment.RetryPaymentDecorator;
import org.ee.payment.StripePaymentService;

public class Main
{
    public static void main(String[] args)
    {
        // Client
        // client can add decorators as he want without changing / modifying code
//        Notification notification =
//          new SecurityDecorator(new LoggingDecorator(new BasicNotification()));
//        notification.send();

        // --------------

        PaymentService paymentService =
          new LoggingPaymentDecorator(new RetryPaymentDecorator(
                                            new PaypalPaymentService(), 10)
        );
        // order : Logging.pay() -> Retry.pay() -> Paypal.pay() -> Complete Retry.pey() -> Complete Logging.pay()
        Payment p1 = new Payment("Pay1" , 230.3);
        Payment p2 = new Payment("Pay2" , 23030.3);
        paymentService.pay(p1);
        System.out.println("*--*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*");
        // now i can change it to something like this
        // Logging -> Stripe -> Complete  Logging.pay()
        paymentService = new LoggingPaymentDecorator(new StripePaymentService());
        paymentService.pay(p2);
    }
}