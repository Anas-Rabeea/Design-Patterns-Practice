package org.template.order;

public enum OrderType {
    PHONE,
    ONLINE,
    INSTORE;

    public static OrderType fromString(String type)
    {
        try {
                return OrderType.valueOf(type.trim().toUpperCase());
            }
        catch (IllegalArgumentException e )
        {
            throw new IllegalArgumentException("Enter A Valid Order Type: phone , Online , InStore");
        }
    }
}
