
public class PayFastAPI {
    // simulating  a 3rd party API Class (or a legacy system) -> we can't control this at all .

    public void sendPaymentEmail(String email, String message) {
        System.out.println("PayFastAPI: " + message + " sent to " + email);
    }

}
