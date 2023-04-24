package com.design.newsfeed.Controller;

import com.design.newsfeed.Models.Session;
import com.design.newsfeed.Models.User;
import com.design.newsfeed.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private SessionService sessionService;

    public User createUser(User user){
        return userRepository.save(user);
    }
    public Session login(User user){
        String userName = user.getUserName();
        String password = user.getPassword();
        User validUser = userRepository.findByUserNameAndPassword(userName, password);

        if(validUser != null){
            Session session = new Session();
            session.setUser(validUser);
            String sessionId = UUID.randomUUID().toString();
            sessionService.createSession(sessionId,validUser);
            return session;
        }
        else
            throw new IllegalArgumentException("Invalid Credentials");

    }

}



