package org.template.order;

public abstract class OrderProcessor {

    protected abstract void setItems();
    protected abstract void setDiscount();
    protected abstract void sendReceipt();

    // Template Method : final to ensure not change the orderProcessing at any time
    public final void orderProcessing()
    {
        setItems();
        setDiscount();
        sendReceipt();
        System.out.println("Order Processed Successfully");
    }






}
