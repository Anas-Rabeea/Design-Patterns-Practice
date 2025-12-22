package org.ee.Factories;

import org.ee.PayPalPayment;
import org.ee.PaymentUtils;

public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public PaymentUtils createPayment() {
        return new PayPalPayment();
    }
}
