import java.math.BigDecimal;

public class StripePaymentProcessor implements PaymentProcessor
{
    @Override
    public void pay(BigDecimal amount)
    {
        System.out.println("Stripe Pay: " + amount);
    }
}
