package com.example.fooddelivery.fd.service;

import com.example.fooddelivery.fd.model.Order;
import com.example.fooddelivery.fd.model.User;
import com.example.fooddelivery.fd.request.OrderRequest;

import java.util.List;

public interface OrderService {

    public Order createOrder(OrderRequest order, User user) throws Exception;

    public Order updateOrder(Long orderId, String orderStatus)throws Exception;

    public void cancelOrder(Long orderId)throws Exception;

    public List<Order> getUsersOrder(Long userId)throws Exception;

    public List<Order> getRestaurantsOrder(Long restaurantId, String orderStatus)throws Exception;

    public Order findOrderById(Long orderId)throws Exception;
}
