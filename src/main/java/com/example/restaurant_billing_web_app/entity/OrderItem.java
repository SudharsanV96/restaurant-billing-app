package com.example.restaurant_billing_web_app.entity;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderItem {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private int quantity;

	    private double price;
	    
	   @JsonIgnore
	    @ManyToOne
	    @JoinColumn(name = "order_id")
	    private Order order;

	    @ManyToOne
	    @JoinColumn(name = "item_id")
	    private Item item;

	    public OrderItem() {}

	    public Long getId() { return id; }
	    public int getQuantity() { return quantity; }
	    public double getPrice() { return price; }
	    public Order getOrder() { return order; }
	    public Item getItem() { return item; }

	    public void setId(Long id) { this.id = id; }
	    public void setQuantity(int quantity) { this.quantity = quantity; }
	    public void setPrice(double price) { this.price = price; }
	    public void setOrder(Order order) { this.order = order; }
	    public void setItem(Item item) { this.item = item; }
}
