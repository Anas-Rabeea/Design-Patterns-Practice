package dev.anascoding;


import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
        // first check Authentication -> Authorization -> Validation
        OrderHandler authenticationHandler = new AuthenticationHandler();
        OrderHandler authorizationHandler  = new AuthorizationHandler();
        OrderHandler validationHandler     = new ValidationHandler();

        authenticationHandler
          .setNextHandler(authorizationHandler)
          .setNextHandler(validationHandler);


        OrderRequest request =
          new OrderRequest("59-*FX" ,
            "Ahmed" ,
            new BigDecimal("33.99"),
            true);


        OrderRequest request1 =
          new OrderRequest("39-*QQ" ,
                            "Ali" ,
                                 new BigDecimal("69.67"),
                    true);

        authenticationHandler.handle(request);

        authenticationHandler.handle(request1);
    }
}