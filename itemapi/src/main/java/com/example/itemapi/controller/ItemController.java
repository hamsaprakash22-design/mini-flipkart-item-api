package com.example.itemapi.controller;

import com.example.itemapi.model.Item;
import com.example.itemapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Integer id) {
        return itemService.getItemById(id);
    }
    
    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Integer id) {

        Item item = itemService.getItemById(id);

        if(item == null) {
            return "Item not found";
        }

        itemService.getAllItems().remove(item);

        return "Item deleted successfully";
    }

}
