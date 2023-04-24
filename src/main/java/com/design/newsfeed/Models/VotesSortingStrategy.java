package com.design.newsfeed.Models;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VotesSortingStrategy implements  NewsFeedSortingStrategy{

        @Override
        public List<Post> sort(List<Post> posts, User user) {
            posts.sort(Comparator.comparingInt(p -> p.getScore()));
            Collections.reverse(posts);
            return posts;
        }
    }


