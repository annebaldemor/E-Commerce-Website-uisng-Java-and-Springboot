package com.middle.app.midrest.Controller;

import java.util.List;

import com.middle.app.midrest.Models.Item;
import com.middle.app.midrest.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ItemController {
    @Autowired
    private ItemService service;

    @GetMapping("/findProducts")
    public List<Item> getProducts() {

        List<Item> items = service.findAllProducts();

        return items;
    }
}


