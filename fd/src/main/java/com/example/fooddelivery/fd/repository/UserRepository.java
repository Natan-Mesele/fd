package com.example.fooddelivery.fd.repository;

import com.example.fooddelivery.fd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String username);
}
