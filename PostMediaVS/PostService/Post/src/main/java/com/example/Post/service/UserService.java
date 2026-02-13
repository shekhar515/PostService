package com.example.Post.service;

import com.example.Post.entity.User;

public interface UserService {

    User getById(Long id);
    User createUser(User user);
    
}

