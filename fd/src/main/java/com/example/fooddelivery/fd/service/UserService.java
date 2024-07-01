package com.example.fooddelivery.fd.service;

import com.example.fooddelivery.fd.model.User;

public interface UserService {

    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String email)throws Exception;
}
