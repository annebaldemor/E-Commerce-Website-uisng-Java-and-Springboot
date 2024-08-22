package com.middle.app.midrest.Repo;

import com.middle.app.midrest.Models.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepo extends JpaRepository <Checkout, Long>{
}
