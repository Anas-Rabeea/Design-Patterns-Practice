package org.template.order;

public class PhoneOrderProcessor extends OrderProcessor{

    @Override
    protected void setItems() {
        System.out.println("Setting Items from the Phone...");
    }

    @Override
    protected void setDiscount() {
        System.out.println("Phone Users has 10% Discount if total > 1000 Logic...");
    }

    @Override
    protected void sendReceipt() {
        System.out.println("Send Receipt via phone as a  WhattsApp Message ...");
    }


}
