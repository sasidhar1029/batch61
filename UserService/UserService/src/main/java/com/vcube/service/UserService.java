package com.vcube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.Entity.User;
import com.vcube.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User save(User user) {
        return repo.save(user);
    }

    public User getUser(Long id) {
        return repo.findById(id).orElse(null);
    }
}
