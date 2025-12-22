package org.ee;

public class CryptoPayment implements PaymentUtils{

    @Override
    public void pay() {
        System.out.println("Paying With Crypto");
    }
}
