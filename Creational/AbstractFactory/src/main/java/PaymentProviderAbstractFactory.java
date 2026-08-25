


// Any Implelmentaion will has its own family of related objects so everything is related to one ting / one family
public interface PaymentProviderAbstractFactory
{
    RefundProcessor createRefundProcessor();
    PaymentProcessor createPaymentProcessor();
}
