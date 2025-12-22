package org.ee;

public class CashPayment implements PaymentUtils{

    @Override
    public void pay() {
        System.out.println("Paying With Cash");
    }
}
