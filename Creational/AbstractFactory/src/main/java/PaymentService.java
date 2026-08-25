import java.math.BigDecimal;

public class PaymentService
{
    private final PaymentProviderAbstractFactory providerAbstractFactory;

    public PaymentService(PaymentProviderAbstractFactory providerAbstractFactory)
    {
        this.providerAbstractFactory = providerAbstractFactory;
    }

    public void processPayment()
    {
        PaymentProcessor paymentProcessor = providerAbstractFactory.createPaymentProcessor();
        RefundProcessor refundProcessor = providerAbstractFactory.createRefundProcessor();

        paymentProcessor.pay(new BigDecimal(20));
        refundProcessor.refund("236-asdas-QQ");

    }
}
