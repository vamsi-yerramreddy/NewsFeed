package com.design.newsfeed.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "followers")
public class Followers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="userId") //column name of the foreign key
    private User user;
    @ManyToOne
    @JoinColumn(name="followerId") //column name of the foreign key
    private User followerId;

}
