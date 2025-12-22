package org.ee;


import org.ee.Factories.PaymentFactory;

public class PaymentService {

    // Strategy Patterns Allows Changing the behavior at runtime
    private final  PaymentUtils paymentUtils;
    // Enum {if dont want to make Factory for object craetion}
   // private final PaymentType paymentType;
//    public PaymentService(PaymentType paymentType) {
//        this.paymentType = paymentType;
//    }

    // Constructor Injection {Tightly coupled to the object creation in the client }
//    public PaymentService(PaymentUtils paymentUtils) {
//        this.paymentUtils = paymentUtils;
//    }

    // Finally we here can use Factory to handle the Payment Type Creation
    // Service doesnt know the Payment Types >>> Extensible


    public PaymentService(PaymentFactory factory) {
        // choosing the behavior type from here >
        // Example :: new PaypalPaymentFactory.createPayment()
        this.paymentUtils = factory.createPayment();
    }

    public void pay(){
        System.out.println("Pre-Payment Logic");
        // this violates The Strategy as now  the service must handle the object creation as well
        // no new() in the service layer > Go to Factory Method to handle the object creation
//        this.paymentUtils = switch (paymentType) {
//            case CREDITCARD -> new CreditCardPayment();
//            case CRYPTO     -> new CryptoPayment();
//            case PAYPAL     -> new PayPalPayment();
//            default         -> new CashPayment();
//        };
        paymentUtils.pay();

    }

}
