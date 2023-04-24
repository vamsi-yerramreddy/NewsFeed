package com.design.newsfeed.Repositories;


import com.design.newsfeed.Models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, String> {

    Session findBySessionId(String sessionId);
    void deleteBySessionId(String sessionId);

}
