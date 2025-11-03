package org.template.order;

public class InStoreOrderProcessor extends OrderProcessor{

    @Override
    protected void setItems() {
        System.out.println("Setting Items from the Store...");
    }


    @Override
    protected void setDiscount() {
        System.out.println("Store Users has 0% Discount ...");
    }


    @Override
    protected void sendReceipt() {
        System.out.println("Send Receipt to the cachier computer ...");
    }

}
