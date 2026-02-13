package com.example.Post.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Post.service.InteractionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Interactions")
@RequiredArgsConstructor
public class InteractionController {
private final InteractionService interactionService;
@PostMapping("/posts/{postId}/like")
    
public ResponseEntity<String> toggleLike(@PathVariable Long postId,
    @PathVariable Long userId)
{
String result = interactionService.toggleLike(userId,postId);
return ResponseEntity.ok(result);
}
}
