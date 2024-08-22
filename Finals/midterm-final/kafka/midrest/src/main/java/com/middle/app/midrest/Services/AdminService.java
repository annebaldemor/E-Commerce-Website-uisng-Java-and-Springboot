package com.middle.app.midrest.Services;

import javax.annotation.PostConstruct;

import com.middle.app.midrest.Models.Admin;
import com.middle.app.midrest.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AdminService {

    @Autowired
    private AdminRepo repository;

    @PostConstruct
    public void initDB(){
        repository.saveAll(Stream.of(new Admin("anneBaldemor", "CEU"),
                new Admin("jeremyYumul", "CEUMalolos")).collect(Collectors.toList()));
    }

    public List<Admin> addAdmin(List<Admin> admins){

        return repository.saveAll(admins);
    }
    public List<Admin> findAllAdmin(){
        return repository.findAll();
    }
}