package com.design.newsfeed.Models;

import java.util.ArrayList;
import java.util.List;

public class FollowedUsersFirstSortingStrategy implements  NewsFeedSortingStrategy{

    @Override
    public List<Post> sort(List<Post> posts, User user) {

           List<Post> followedUsersPosts = new ArrayList<>();
           List<Post> otherPosts = new ArrayList<>();
            List<User> followedUsers = user.getFollowers();

            for (Post post : posts) {
                if (followedUsers.contains(post.getAuthor() )) {
                    followedUsersPosts.add(post);
                } else {
                    otherPosts.add(post);
                }
            }
            followedUsersPosts.addAll(otherPosts);
            return followedUsersPosts;
    }
}
