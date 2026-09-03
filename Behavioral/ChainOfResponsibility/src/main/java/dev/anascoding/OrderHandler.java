package dev.anascoding;

public abstract class OrderHandler
{
    private OrderHandler nextHandler;

    public OrderHandler setNextHandler(OrderHandler nextHandler)
    {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public final void handle(OrderRequest request)
    {
        if (process(request) && nextHandler != null)
        {
            nextHandler.handle(request); // continue to next handler , else throw
        }
        else if (process(request) && nextHandler == null)
        {
            System.out.println("Executing Last Handler");
        }
        else
        {
            throw new IllegalArgumentException("Request %s Failed To Processed".formatted(request.orderId()));
        }
    }

    // here each handler will decide to stop/continue the request or not
    protected abstract boolean process(OrderRequest request);
}
