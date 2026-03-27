package com.example.restaurant_billing_web_app.dto;

public class ItemDetail {
	private String name;
    private int quantity;
    private double price;

    public ItemDetail(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}
