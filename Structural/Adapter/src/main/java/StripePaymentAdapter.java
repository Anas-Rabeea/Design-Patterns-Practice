import java.math.BigDecimal;

public class StripePaymentAdapter implements PaymentGateway
{
    // injecting the 3rd party here in the adapter
    private final StripeClient stripeClient;

    public StripePaymentAdapter(StripeClient stripeClient)
    {
        this.stripeClient = stripeClient;
    }

    // the overriden method is the one which will use the 3rd party service (uncontrolled service)
    @Override
    public PaymentResult charge(BigDecimal amount)
    {
        long cents = amount.movePointRight(2).longValueExact();

        StripeResponse response = stripeClient.createPayment(cents, "USD");

        return mapResponse(response);
    }

    private PaymentResult mapResponse(StripeResponse response)
    {
        // mapper logic
        return new PaymentResult(true, "Success Payment");
    }
}
