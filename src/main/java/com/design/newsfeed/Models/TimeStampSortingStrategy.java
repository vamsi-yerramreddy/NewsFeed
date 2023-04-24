package com.design.newsfeed.Models;

import java.util.Date;
import java.util.List;

public class TimeStampSortingStrategy implements NewsFeedSortingStrategy{
    @Override
    public List<Post> sort(List<Post> posts,User user) {
            posts.sort(
                    (p1, p2) ->
                       {
                Date date = new Date(p1.getTimestamp());
                Date p2_date = new Date(p2.getTimestamp());
                return date.compareTo(p2_date);
            }
            );
            return posts;
    }
}

