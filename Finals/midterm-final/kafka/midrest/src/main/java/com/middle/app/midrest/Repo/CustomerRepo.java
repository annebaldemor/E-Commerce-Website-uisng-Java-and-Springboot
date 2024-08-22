package com.middle.app.midrest.Repo;

import com.middle.app.midrest.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
