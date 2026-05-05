package com.vcube.controller;

import org.springframework.web.bind.annotation.*;

import com.vcube.model.LoginRequest;
import com.vcube.utility.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest logReq) {

        if (logReq.getUsername().equals("srikanth")
                && logReq.getPassword().equals("1234")) {

            return JwtUtil.generateToken(logReq.getUsername());
        }

        return "Invalid Credentials";
    }
}
