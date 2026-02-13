package com.example.Post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Post.DTO.PostResponseDTO;
import org.springframework.http.MediaType; 
import com.example.Post.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {
private final PostService postService;
//create post
@PostMapping( value="/upload",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
public ResponseEntity<PostResponseDTO> createPost(
    @RequestParam("caption") String caption,
      @RequestParam("file")MultipartFile file,
      @RequestParam("userId") Long userId)
     {
        PostResponseDTO response =postService.createPost(caption, file, userId);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
     }
}
