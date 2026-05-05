package com.vcube.controller;

import org.springframework.web.bind.annotation.*;

import com.vcube.utility.JwtUtil;

@RestController
public class UserController {

    @GetMapping("/profile")
    public String profile(@RequestHeader("Authorization") String authHeader) {

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return "Token Missing";
        }

        String token = authHeader.substring(7);

        if (!JwtUtil.validateToken(token)) {
            return "Invalid Token";
        }

        String username = JwtUtil.extractUsername(token);

        return "Welcome " + username + ", This is your profile data";
    }
}
