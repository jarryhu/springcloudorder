package com.hukun.repository;


import com.hukun.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public User login(String username, String password);
}
