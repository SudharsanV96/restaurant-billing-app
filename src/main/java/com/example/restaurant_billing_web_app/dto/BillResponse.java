package com.example.restaurant_billing_web_app.dto;
import java.util.List;
public class BillResponse {
	  private Long orderId;
	    private List<ItemDetail> items;
	    private double total;

	    public BillResponse(Long orderId, List<ItemDetail> items, double total) {
	        this.orderId = orderId;
	        this.items = items;
	        this.total = total;
	    }

	    public Long getOrderId() { return orderId; }
	    public List<ItemDetail> getItems() { return items; }
	    public double getTotal() { return total; }
}
