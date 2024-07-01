package com.example.fooddelivery.fd.response;

import com.example.fooddelivery.fd.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;

    private String message;

    private USER_ROLE role;
}
