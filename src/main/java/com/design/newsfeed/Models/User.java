package com.design.newsfeed.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Data
@Entity
@Table(name="users")
public class User extends  Person{
    private String userName;
    private String password;
    private String email;
    @OneToMany
    private  List<User> followers;
    @OneToMany
    private List<User>following;


}
