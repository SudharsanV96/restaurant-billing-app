package com.example.restaurant_billing_web_app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    
    public Item() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

}

