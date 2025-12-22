package org.ee.Factories;

import org.ee.CreditCardPayment;
import org.ee.PaymentUtils;

public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public PaymentUtils createPayment() {
        return new CreditCardPayment();
    }
}
