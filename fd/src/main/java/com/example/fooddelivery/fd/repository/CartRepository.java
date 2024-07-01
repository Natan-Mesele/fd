package com.example.fooddelivery.fd.repository;

import com.example.fooddelivery.fd.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
