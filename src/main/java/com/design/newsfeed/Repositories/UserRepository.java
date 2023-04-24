package com.design.newsfeed.Repositories;

import com.design.newsfeed.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

        User findByUserNameAndPassword(String userName, String password);

}


