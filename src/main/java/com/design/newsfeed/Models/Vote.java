package com.design.newsfeed.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "votes")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;

    @ManyToOne
    private Post post;

    @Enumerated(EnumType.STRING)
    private Reaction type;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

}
