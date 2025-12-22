package org.ee;

import org.ee.Factories.CreditCardPaymentFactory;

public class Main {
    public static void main(String[] args) {

        /*
         this line will make it tightly coupled with the Payment Object Creation (BAD)
        PaymentService service =
                new PaymentService(new CreditCardPayment());
        service.pay();
        */
        // let the Service handle the object creation
//        PaymentService service =
//                new PaymentService(PaymentType.CRYPTO);
//
//        service.pay();


        // In Spring , it will create the factories and we only choose the implementation
        // @Qualifier , @Primary
        PaymentService service =
                new PaymentService(new CreditCardPaymentFactory());
        service.pay();

    }
}