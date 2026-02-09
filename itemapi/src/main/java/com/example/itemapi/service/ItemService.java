package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();
    private int currentId = 1;

    public Item addItem(Item item) {
        item.setId(currentId++);
        items.add(item);
        return item;
    }
    public void deleteItem(Integer id) {
        items.removeIf(item -> item.getId().equals(id));
    }


    public List<Item> getAllItems() {
        return items;
    }

    public Item getItemById(Integer id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
