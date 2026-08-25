import java.math.BigDecimal;

public class PaypalPaymentProcessor implements PaymentProcessor
{
    @Override
    public void pay(BigDecimal amount)
    {
        System.out.println("Paypal Pay: " + amount);
    }
}
