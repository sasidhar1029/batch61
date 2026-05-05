package com.loginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.loginapp.entity.User;
import com.loginapp.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String home() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        service.register(user);
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {

        User user = service.login(username, password);

        if (user != null) {
            model.addAttribute("username", username);
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid Username or Password");
            return "login";
        }
    }
}
