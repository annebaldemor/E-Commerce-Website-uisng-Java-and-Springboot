package com.middle.app.midrest.Repo;

import com.middle.app.midrest.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {
}
