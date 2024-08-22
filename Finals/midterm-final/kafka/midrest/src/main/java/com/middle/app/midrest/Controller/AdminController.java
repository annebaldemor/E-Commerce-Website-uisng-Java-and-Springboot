package com.middle.app.midrest.Controller;

import com.middle.app.midrest.Models.Admin;
import com.middle.app.midrest.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminRepo adminRepo;

    @GetMapping("/registeredAdmins")
    public List<Admin> getAdmin(){
        return adminRepo.findAll();
    }
}
