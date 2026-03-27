package com.example.restaurant_billing_web_app.controller;
import com.example.restaurant_billing_web_app.entity.Order;
import com.example.restaurant_billing_web_app.entity.OrderItem;
import com.example.restaurant_billing_web_app.service.OrderService;
import com.example.restaurant_billing_web_app.dto.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
	  private final OrderService orderService;

	    public OrderController(OrderService orderService) {
	        this.orderService = orderService;
	    }

	    @PostMapping
	    public Order createOrder(@RequestBody List<OrderItem> orderItems) {
	        return orderService.createOrder(orderItems);
	    }
	    
	    @GetMapping("/{id}")
	    public Order getOrderById(@PathVariable Long id) {
	        return orderService.getOrderById(id);
	    }

	    @GetMapping
	    public List<Order> getAllOrders() {
	        return orderService.getAllOrders();
	    }
	    
	    @GetMapping("/{id}/bill")
	    public BillResponse getBill(@PathVariable Long id) {
	        return orderService.getBill(id);
	    }
}
