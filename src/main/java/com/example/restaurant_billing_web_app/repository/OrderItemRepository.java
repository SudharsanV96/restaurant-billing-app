package com.example.restaurant_billing_web_app.repository;


import com.example.restaurant_billing_web_app.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
