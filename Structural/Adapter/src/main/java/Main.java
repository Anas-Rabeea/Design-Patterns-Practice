


public class Main {

 public static void main(String[] args)
 {
    PayFastAPI payFastAPI = new PayFastAPI();
    PaymentNotifier notifier = new PaymentNotifierAdapter(payFastAPI);

    notifier.notifyPayment("user@example.com" , 250.0);

     System.out.println("Test");
 }

}
