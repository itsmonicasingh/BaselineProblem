package com.tw.baseline;

public class Receipt {

    private String itemName;
    private int noOfItems;
    private double itemPrice;

    public Receipt(int noOfItems, String itemName, double itemPrice) {
        this.noOfItems = noOfItems;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double calculateTotal() {
        return noOfItems * itemPrice;
    }
}
