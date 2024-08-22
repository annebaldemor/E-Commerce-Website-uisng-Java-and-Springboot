package com.middle.app.midrest.Controller;

import com.middle.app.midrest.Models.AddItem;
import com.middle.app.midrest.Repo.AddItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddItemController {
    @Autowired
    private AddItemRepo addItemRepo;

    @GetMapping(value = "/addItem")
    public List<AddItem> getAddItem(){
        return addItemRepo.findAll();
    }

    @PostMapping("/saveAddItem")
    public String saveAddItem(@RequestBody AddItem addItem){
        addItemRepo.save(addItem);
        return "Item saved...";
    }

    @PutMapping(value = "/updateAddItem/{id}")
    public String updateAddItem(@PathVariable Long id, @RequestBody AddItem addItem){
        AddItem updatedAddItem = addItemRepo.findById(id).get();
        updatedAddItem.setItemId(addItem.getItemId());
        updatedAddItem.setItemName(addItem.getItemName());
        updatedAddItem.setItemSpecs(addItem.getItemSpecs());
        updatedAddItem.setItemPrice(addItem.getItemPrice());
        updatedAddItem.setItemAmount(addItem.getItemAmount());
        addItemRepo.save(addItem);
        return "Item updated...";
    }

    @DeleteMapping(value = "/deleteAddItem/{id}")
    public String deleteAddItem(@PathVariable long id){
        AddItem deleteAddItem = addItemRepo.findById(id).get();
        addItemRepo.delete(deleteAddItem);
        return "Item deleted...";
    }
}
