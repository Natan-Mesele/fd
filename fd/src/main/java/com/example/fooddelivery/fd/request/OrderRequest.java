package com.example.fooddelivery.fd.request;

import com.example.fooddelivery.fd.model.Address;
import lombok.Data;

@Data
public class OrderRequest {

    private Long restaurantId;
    private Address deliveryAddress;
}
