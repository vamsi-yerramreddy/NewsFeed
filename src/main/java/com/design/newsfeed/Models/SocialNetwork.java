package com.design.newsfeed.Models;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table

public class SocialNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<User> userList;

}
