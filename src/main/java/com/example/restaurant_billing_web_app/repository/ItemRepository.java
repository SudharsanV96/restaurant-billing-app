package com.example.restaurant_billing_web_app.repository;

import com.example.restaurant_billing_web_app.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ItemRepository extends JpaRepository<Item, Long> {

}
