package com.vcube.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
