package com.middle.app.midrest.Repo;

import com.middle.app.midrest.Models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, Long> {
}
