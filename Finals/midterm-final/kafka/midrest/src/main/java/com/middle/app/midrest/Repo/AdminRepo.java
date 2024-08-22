package com.middle.app.midrest.Repo;

import com.middle.app.midrest.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}