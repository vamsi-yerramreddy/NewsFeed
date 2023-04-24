package com.design.newsfeed.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "followingList")
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;

    @ManyToOne
    @JoinColumn(name="followingId")
    private User followingId;

}
