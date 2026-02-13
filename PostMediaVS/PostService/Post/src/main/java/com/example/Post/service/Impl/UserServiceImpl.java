package com.example.Post.service.Impl;

import org.springframework.stereotype.Service;

import com.example.Post.entity.User;
import com.example.Post.repository.UserRepository;
import com.example.Post.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

private final  UserRepository userRepository;
@Override
public User getById(Long id){
    return userRepository.findById(id)
    .orElseThrow(()-> new RuntimeException("User Not found"));
}
@Override
public User createUser(User user){
    return userRepository.save(user);
}
}
