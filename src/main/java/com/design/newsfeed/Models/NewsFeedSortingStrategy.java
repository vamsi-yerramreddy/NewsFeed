package com.design.newsfeed.Models;

import java.util.List;

public interface NewsFeedSortingStrategy {
    List<Post> sort(List<Post> Posts, User user);
}
