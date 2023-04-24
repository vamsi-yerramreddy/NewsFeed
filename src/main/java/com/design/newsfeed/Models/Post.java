package com.design.newsfeed.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

//Below class for handling  social media posts
@Data
@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User author;
    private String content;
    long timestamp;
    @OneToMany
    private List<Vote> reactionList;
    @OneToMany
    private List<Comment> commentsList;

    public Post() {
        this.timestamp = System.currentTimeMillis();
    }
    public int getScore() {
        int upvotes = 0;
        int downvotes = 0;
        for (Vote reaction : reactionList) {
            if (reaction.getType() == Reaction.UPVOTE) {
                upvotes++;
            } else if (reaction.getType() == Reaction.DOWNVOTE) {
                downvotes++;
            }
        }
        return upvotes - downvotes;
    }


}
