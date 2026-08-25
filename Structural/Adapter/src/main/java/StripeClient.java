public class StripeClient
{
    public StripeResponse createPayment(long cents , String currency)
    {
        System.out.println("Calling the 3rd Party Stripe Payment");
        return new StripeResponse("Called");
    }
}
