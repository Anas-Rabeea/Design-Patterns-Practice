package dev.anascoding;

public class ValidationHandler extends OrderHandler
{

    @Override
    protected boolean process(OrderRequest request)
    {
        // Any validation logic here
        return request.total().intValue() >= 20;
    }
}
