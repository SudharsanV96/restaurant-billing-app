package com.example.restaurant_billing_web_app.service;


import com.example.restaurant_billing_web_app.entity.*;
import com.example.restaurant_billing_web_app.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {
	 private final ItemRepository itemRepository;

	    public ItemService(ItemRepository itemRepository) {
	        this.itemRepository = itemRepository;
	    }

	    public Item addItem(Item item) {
	        return itemRepository.save(item);
	    }

	    public List<Item> getAllItems() {
	        return itemRepository.findAll();
	    }
}
