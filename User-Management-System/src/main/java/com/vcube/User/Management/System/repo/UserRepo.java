package com.vcube.User.Management.System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.User.Management.System.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
