package com.example.fooddelivery.fd.repository;

import com.example.fooddelivery.fd.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
