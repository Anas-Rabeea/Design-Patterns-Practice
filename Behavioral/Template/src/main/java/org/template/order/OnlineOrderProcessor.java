package org.template.order;

public class OnlineOrderProcessor extends OrderProcessor{
    @Override
    protected void setItems() {
        System.out.println("Setting Items from the Online Store ...");
    }

    @Override
    protected void setDiscount() {
        System.out.println("Online Users has 20% Discount if total > 1000 Logic ...");
    }

    @Override
    protected void sendReceipt() {
        System.out.println("Send Receipt via Email  ...");
    }

}
