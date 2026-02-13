package com.example.Post.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Post.entity.Comment;
import com.example.Post.service.Impl.CommentServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentServiceImpl commentServiceImpl;


    
    @PostMapping("/add")
    public ResponseEntity<Comment> addComment(
        @RequestParam Long userId,
        @RequestParam Long postId,
        @RequestParam String text){
            return ResponseEntity.ok(commentServiceImpl.addComment(userId, postId, text));
        }
        @GetMapping("/post/{postId}")
        public ResponseEntity<List<Comment>> getComments(@PathVariable Long postId ){
            return ResponseEntity.ok(commentServiceImpl.getCommentByPost(postId));
        }

}
