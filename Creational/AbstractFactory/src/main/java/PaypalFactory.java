
// now each factory will has its own related family of objects ,
// so we cant use other families objects (Single Responsibility)

public class PaypalFactory implements PaymentProviderAbstractFactory
{
    @Override
    public RefundProcessor createRefundProcessor()
    {
        return new PaypalRefundProcessor();
    }

    @Override
    public PaymentProcessor createPaymentProcessor()
    {
        return new PaypalPaymentProcessor();
    }
}
