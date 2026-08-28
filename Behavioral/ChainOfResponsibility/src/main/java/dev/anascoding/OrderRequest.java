package dev.anascoding;

import java.math.BigDecimal;

public record OrderRequest(
  String orderId, String name, BigDecimal total , boolean isAuthenticated
)
{
}
