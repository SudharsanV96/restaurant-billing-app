package com.example.restaurant_billing_web_app.controller;

import com.example.restaurant_billing_web_app.entity.*;
import com.example.restaurant_billing_web_app.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@CrossOrigin
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getAllItems();
    }
}
