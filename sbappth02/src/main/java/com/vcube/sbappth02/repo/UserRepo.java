package com.vcube.sbappth02.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.sbappth02.model.User;

@Repository
 
public interface UserRepo extends JpaRepository<User,Integer>{
	//abstract method
	User findUserByUsernameAndPassword(String username,String password
			);

}
