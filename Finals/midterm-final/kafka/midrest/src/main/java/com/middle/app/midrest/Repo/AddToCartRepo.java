package com.middle.app.midrest.Repo;

import com.middle.app.midrest.Models.AddToCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddToCartRepo extends JpaRepository<AddToCart, Long> {
    void delete(AddToCart deleteUser);
}