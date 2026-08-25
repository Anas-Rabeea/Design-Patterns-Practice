public class StripeRefundProcessor implements RefundProcessor
{

    @Override
    public void refund(String transactionId)
    {
        System.out.println("Stripe refunding for transaction ID : " + transactionId);
    }
}

