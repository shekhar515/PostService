package com.example.Post.service;

import java.util.List;

import com.example.Post.entity.Comment;

public interface CommentService {
Comment addComment(Long userId,Long postId, String text);
List<Comment> getCommentByPost(Long postId);
}
