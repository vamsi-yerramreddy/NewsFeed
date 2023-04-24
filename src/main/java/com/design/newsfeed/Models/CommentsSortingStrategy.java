package com.design.newsfeed.Models;

import java.util.List;

public class CommentsSortingStrategy implements  NewsFeedSortingStrategy{
    @Override
    public List<Post> sort(List<Post> posts, User user  ) {

         posts.sort((p1, p2) -> p2.getCommentsList().size() - p1.getCommentsList().size());
        return posts;
    }
}
