package org.ee.order;

import java.math.BigDecimal;

public record OrderPlacementEvent(
  String orderId ,
  String buyer,
  BigDecimal total
)
{
    @Override
    public String toString()
    {
        return "Order Id is " + orderId + " buyer is " + buyer + " total is : " + total;
    }
}
