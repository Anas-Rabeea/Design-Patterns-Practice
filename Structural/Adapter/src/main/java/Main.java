import java.math.BigDecimal;

public class Main {

 public static void main(String[] args)
 {

     // CLIENT
    PayFastAPI payFastAPI = new PayFastAPI(); // the 3rd Party Service
    PaymentNotifier notifier = new PaymentNotifierAdapter(payFastAPI);

    notifier.notifyPayment("user@example.com" , 250.0);

     System.out.println("Test");
     System.out.println("--------------------------------------------");

     StripePaymentAdapter stripePaymentAdapter = new StripePaymentAdapter();
    CheckoutService service = new CheckoutService(stripePaymentAdapter);
    service.checkout(new BigDecimal("300.663"));



 }

}
