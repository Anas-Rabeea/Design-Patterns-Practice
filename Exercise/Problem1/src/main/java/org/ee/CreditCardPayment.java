package org.ee;

public class CreditCardPayment implements PaymentUtils{

    @Override
    public void pay() {
        System.out.println("Paying With Credit Card");
    }
}
