

public class PaymentNotifierAdapter  implements PaymentNotifier{

    // to make it immutable
    private final PayFastAPI payFastAPI ;

    // Injection via constructor
    public PaymentNotifierAdapter(PayFastAPI payFastAPI) {
        if (payFastAPI == null)
            throw new IllegalArgumentException("PayFastAPI cannot be null");

        this.payFastAPI = payFastAPI;
    }

    @Override
    public void notifyPayment(String userEmail, double amount) {
        payFastAPI.sendPaymentEmail(userEmail , "Payment of $" + amount);
        System.out.println("Payment notification sent successfully!");

    }
}
