import java.math.BigDecimal;

public class CheckoutService
{
    private final PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway)
    {
        this.paymentGateway = paymentGateway;
    }

    public PaymentResult checkout(BigDecimal amount) {

        return paymentGateway.charge(amount);
    }
}
