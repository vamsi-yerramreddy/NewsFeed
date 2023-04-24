package com.design.newsfeed.Controller;

import com.design.newsfeed.Models.Session;
import com.design.newsfeed.Models.User;
import com.design.newsfeed.Repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public Session createSession(String SessionId, User user) {
       Session session = new Session();
       session.setSessionId(SessionId);
       session.setUser(user);
       session.setTimeStamp(new Date());
        return sessionRepository.save(session);
    }

    public Session getSession(String sessionId){
        return sessionRepository.findBySessionId(sessionId);
    }

    public void deleteSession(String sessionId) {
        sessionRepository.deleteBySessionId(sessionId);
    }
}
