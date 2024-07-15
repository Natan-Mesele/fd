package com.example.fooddelivery.fd.service;

import com.example.fooddelivery.fd.config.JwtProvider;
import com.example.fooddelivery.fd.model.User;
import com.example.fooddelivery.fd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email= jwtProvider.getEmailFromToken(jwt);
        User user = findUserByEmail(email);
        return user;
    }

    @Override
    public User findUserByEmail(String email) throws Exception {
        User user=userRepository.findByEmail(email);
        if(user==null){
            throw new Exception("user not found");
        }
        return user;
    }
}
