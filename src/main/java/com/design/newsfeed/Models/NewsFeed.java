package com.design.newsfeed.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import  java.util.List;

@Data
@Entity
@Table
public class NewsFeed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Post> postList;
    @OneToMany
    private List<User> userList;
   /*public  String sortingStrategy;

    public void setSortingStrategy(NewsFeedSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public List<Post> getSortedPosts(User user) {
        return sortingStrategy.sort(postList, user);
    }*/

}

