package dev.anascoding;

public class AuthenticationHandler extends OrderHandler
{

    @Override
    protected boolean process(OrderRequest request)
    {
        return request.isAuthenticated();
    }
}
