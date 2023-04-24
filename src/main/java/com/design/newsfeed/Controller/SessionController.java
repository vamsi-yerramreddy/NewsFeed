package com.design.newsfeed.Controller;

import com.design.newsfeed.Models.Session;
import com.design.newsfeed.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping("")
    public ResponseEntity<?> createSession(@RequestBody User user){
        String sessionId = UUID.randomUUID().toString();
        Session session = sessionService.createSession(sessionId, user);
        return ResponseEntity.ok(session);

    }
    @GetMapping("/{sessionId}")
    public ResponseEntity<?> getSession(@PathVariable String sessionId) {
        Session session = sessionService.getSession(sessionId);
        if (session == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(session);
    }
    @DeleteMapping("/{sessionId}")
    public ResponseEntity<?> deleteSession(@PathVariable String sessionId) {
        Session session = sessionService.getSession(sessionId);
        if (session == null) {
            return ResponseEntity.notFound().build();
        }
        sessionService.deleteSession(session.getSessionId());
        return ResponseEntity.ok().build();
    }




}
