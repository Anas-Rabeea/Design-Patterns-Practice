package org.ee;

public class PayPalPayment implements PaymentUtils{

    @Override
    public void pay() {
        System.out.println("Paying With Paypal");
    }
}
