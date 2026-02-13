package com.example.Post.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.example.Post.DTO.PostResponseDTO;

public interface PostService {
PostResponseDTO createPost(String caption , MultipartFile file ,Long userId);
Page<PostResponseDTO>  getfeed(Pageable pageable);
PostResponseDTO getPostById(Long id);
void incrementLikes(Long postId);
void decrementLikes(Long postId);
void incrementComment(Long postId);
}
