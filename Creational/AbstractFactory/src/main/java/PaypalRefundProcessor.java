public class PaypalRefundProcessor implements RefundProcessor
{

    @Override
    public void refund(String transactionId)
    {
        System.out.println("Paypal refunding for transaction ID : " + transactionId);
    }
}

