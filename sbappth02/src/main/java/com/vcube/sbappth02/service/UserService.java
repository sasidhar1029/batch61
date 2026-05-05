package com.vcube.sbappth02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.sbappth02.model.User;
import com.vcube.sbappth02.repo.UserRepo;

@Service

public class UserService {
	@Autowired
	UserRepo userrepo;

	public User findUserByUsernameAndPassword(String username, String password) {
		return userrepo.findUserByUsernameAndPassword(username, password);
	}

	public List<User> getAllUser() {
		return userrepo.findAll();
	}

	public User getById(int uid) {
		return userrepo.findById(uid).orElse(null);
	}

	public User insertUser(User user) {
		return userrepo.save(user);
	}

	public void deleteById(int uid) {
		userrepo.deleteById(uid);
	}
}
