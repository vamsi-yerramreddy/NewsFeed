package com.design.newsfeed.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String firstName;
    public String lastName;
    private Integer phoneNumber;
    @Enumerated(EnumType.STRING)
    public Gender gender;


}
