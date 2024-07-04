package com.example.fooddelivery.fd.repository;

import com.example.fooddelivery.fd.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
