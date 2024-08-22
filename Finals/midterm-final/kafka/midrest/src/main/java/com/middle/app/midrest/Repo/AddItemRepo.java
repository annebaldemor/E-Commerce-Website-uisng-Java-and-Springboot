package com.middle.app.midrest.Repo;

import com.middle.app.midrest.Models.AddItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddItemRepo extends JpaRepository<AddItem, Long> {
}
