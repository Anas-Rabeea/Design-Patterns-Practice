public class StripeFactory implements PaymentProviderAbstractFactory

{
    @Override
    public RefundProcessor createRefundProcessor()
    {
        return new StripeRefundProcessor();
    }

    @Override
    public PaymentProcessor createPaymentProcessor()
    {
        return new StripePaymentProcessor();
    }
}
