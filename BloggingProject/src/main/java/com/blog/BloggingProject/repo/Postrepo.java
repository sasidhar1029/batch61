package com.blog.BloggingProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.BloggingProject.model.Post;

public interface Postrepo extends JpaRepository<Post,Integer> {

}
