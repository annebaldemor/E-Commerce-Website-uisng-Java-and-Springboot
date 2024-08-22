package com.middle.app.midrest.Controller;

import com.middle.app.midrest.Models.Checkout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.middle.app.midrest.Repo.CheckoutRepo;

import java.util.List;

@RestController
public class CheckoutController {

    @Autowired
    private CheckoutRepo CheckoutRepo;

    @GetMapping(value = "/myCart")
    public List<Checkout> getCheckout(){

        return CheckoutRepo.findAll();
    }

    @PostMapping(value = "/checkoutItems")
    public String savedCheckout(@RequestBody Checkout checkout){
        CheckoutRepo.save(checkout);
        return "To confirm your order kindly, re-enter your details here: http://localhost:9999/post/message";
    }

}
