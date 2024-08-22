package com.middle.app.midrest.Controller;

import com.middle.app.midrest.Models.Customer;
import com.middle.app.midrest.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping(value = "/customerUser")
    public List<Customer> getCustomers(){
        return customerRepo.findAll();
    }

    @PostMapping(value = "/saveCustomerUser")
    public String saveCustomerUser(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "Customer user saved...";
    }

    @PutMapping(value = "/updateCustomerUser/{id}")
    public String updateCustomerUser(@PathVariable Long id, @RequestBody Customer customer){
        Customer updatedCustomerUser = customerRepo.findById(id).get();
        updatedCustomerUser.setCustomerId(customer.getCustomerId());
        updatedCustomerUser.setCustomerUsername(customer.getCustomerUsername());
        updatedCustomerUser.setCustomerPassword(customer.getCustomerPassword());
        customerRepo.save(customer);
        return "Customer user updated...";
    }

    @DeleteMapping(value = "/deleteCustomerUser/{id}")
    public String deleteCustomerUser(@PathVariable long id){
        Customer deleteCustomerUser = customerRepo.findById(id).get();
        customerRepo.delete(deleteCustomerUser);
        return "Customer User deleted...";
    }
}
