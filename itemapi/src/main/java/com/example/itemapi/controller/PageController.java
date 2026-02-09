package com.example.itemapi.controller;

import com.example.itemapi.model.Item;
import com.example.itemapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    @Autowired
    private ItemService itemService;

    // Show Products Page
    @GetMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "products";
    }

    // Show Add Product Form
    @GetMapping("/add-product")
    public String showAddForm(Model model) {
        model.addAttribute("item", new Item());
        return "add-product";
    }

    // Handle Form Submission
    @PostMapping("/save-product")
    public String saveProduct(@ModelAttribute Item item) {
        itemService.addItem(item);
        return "redirect:/products";
    }
}
