package com.hukun.repository;


import com.hukun.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository {
    public Admin login(String username, String password);
}
