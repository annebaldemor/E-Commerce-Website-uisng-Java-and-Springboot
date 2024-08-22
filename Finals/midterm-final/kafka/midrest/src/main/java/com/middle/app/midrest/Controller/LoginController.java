package com.middle.app.midrest.Controller;

import com.middle.app.midrest.Models.Login;
import com.middle.app.midrest.Repo.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginRepo LoginRepo;

    @PostMapping(value = "/login")
    public String savedLogin(@RequestBody Login login){
        LoginRepo.save(login);
        return "Welcome to Malolos and Makati PC Shop!\n just click this link to see the available items: http://localhost:8080/Available-Items";
    }
}
