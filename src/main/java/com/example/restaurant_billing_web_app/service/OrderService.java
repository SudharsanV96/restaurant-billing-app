package com.example.restaurant_billing_web_app.service;
import com.example.restaurant_billing_web_app.entity.*;
import com.example.restaurant_billing_web_app.repository.*;
import com.example.restaurant_billing_web_app.dto.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
	 private final OrderRepository orderRepository;
	    private final ItemRepository itemRepository;

	    public OrderService(OrderRepository orderRepository, ItemRepository itemRepository) {
	        this.orderRepository = orderRepository;
	        this.itemRepository = itemRepository;
	    }

	    public Order createOrder(List<OrderItem> orderItems) {

	        Order order = new Order();
	        order.setCreatedAt(LocalDateTime.now());

	        double total = 0;

	        for (OrderItem oi : orderItems) {
	            Item item = itemRepository.findById(oi.getItem().getId()).orElseThrow();

	            oi.setPrice(item.getPrice());
	            oi.setOrder(order);

	            total += item.getPrice() * oi.getQuantity();
	        }

	        order.setOrderItems(orderItems);
	        order.setTotalAmount(total);

	        return orderRepository.save(order);
	    }
	    
	    public Order getOrderById(Long id) {
	        return orderRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Order not found"));
	    }

	    public List<Order> getAllOrders() {
	        return orderRepository.findAll();
	    }
	    
	    public BillResponse getBill(Long orderId) {

	        Order order = getOrderById(orderId);

	        List<ItemDetail> items = order.getOrderItems().stream()
	                .map(oi -> new ItemDetail(
	                        oi.getItem().getName(),
	                        oi.getQuantity(),
	                        oi.getPrice()
	                ))
	                .toList();

	        return new BillResponse(order.getId(), items, order.getTotalAmount());
	    }
}
