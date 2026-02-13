package com.example.Post.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="comments")
@Getter@Setter
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false)
private String text;
@ManyToOne
@JoinColumn(name="post_id")
private Post post;
@ManyToOne
@JoinColumn(name="user_id")
private User user;
@CreationTimestamp
private LocalDateTime createdAt;

}
