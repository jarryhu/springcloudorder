package com.hukun.controller;


import com.hukun.entity.Account;
import com.hukun.repository.AdminRepository;
import com.hukun.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("type") String type, HttpSession session){
        Account account = null;
        switch (type){
            case "user":
                account = userRepository.login(username, password);
                session.setAttribute("user",account);
                break;
            case "admin":
                account = adminRepository.login(username, password);
                session.setAttribute("admin",account);
                break;
        }
        return account;
    }
}
