package com.design.newsfeed.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

// class to handle the comment section in Social media feed
@Data
@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String text;
    @OneToMany
     private List<Vote> reactionList;
    @ManyToOne
    @JoinColumn(name="postId")
     private Post post;

}
