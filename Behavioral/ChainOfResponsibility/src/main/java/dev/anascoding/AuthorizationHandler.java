package dev.anascoding;

public class AuthorizationHandler extends OrderHandler
{
    @Override
    protected boolean process(OrderRequest request)
    {
        // Ali is a baned user
        return !request.name().equals("Ali");
    }
}
