package com.vcube.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.users.Entity.User;
import com.vcube.users.repo.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody User loginUser) {

        System.out.println("Entered Username: '" + loginUser.getUsername() + "'");
        System.out.println("Entered Password: '" + loginUser.getPassword() + "'");

        User user = userRepository.findByUsername(loginUser.getUsername().trim());

        if (user == null) {
            System.out.println("❌ User NOT found in DB");
            return "Invalid Credentials";
        }

        System.out.println("DB Username: '" + user.getUsername() + "'");
        System.out.println("DB Password: '" + user.getPassword() + "'");

        if (user.getPassword().equals(loginUser.getPassword().trim())) {
            System.out.println("✅ Password matched");
            return "Login Successful";
        } else {
            System.out.println("❌ Password NOT matched");
        }

        return "Invalid Credentials";
    }

	
}
