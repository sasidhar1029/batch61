package com.vcube.User.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.User.Management.System.model.User;
import com.vcube.User.Management.System.repo.UserRepo;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserRepo userrepo;
	
	@PostMapping("insertUser")
	public User insertuser(@Valid @RequestBody User user) {
		return userrepo.save(user);
	}
	
	@GetMapping("getUser")
	public List<User> getUsers() {
		return userrepo.findAll();
	}
	
	@PutMapping("updateUser/{id}")
	public User updateUser(@Valid @RequestBody User user,@PathVariable("id") int id){
	User  existing=	userrepo.findById(id). orElseThrow(() -> new RuntimeException("User not found"));
	existing.setName(user.getName());
	
	return userrepo.save(existing);
	}
	
	@DeleteMapping("deleteUserById/{id}")
	public String deleteUser(@Valid @PathVariable int id) {

	    if (!userrepo.existsById(id)) {
	        return "User not found with id " + id;
	    }

	    userrepo.deleteById(id);

	    return "User deleted successfully with id " + id;
	}
}
