package com.example.Post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Post.entity.User;
import com.example.Post.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
private final UserService userService;
@PostMapping("/create")
public ResponseEntity<User> createUser(@RequestBody User user){
    return new ResponseEntity<>(userService.createUser(user),HttpStatus.CREATED);
}
}
