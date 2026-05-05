package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.Home;

public interface HomeRepository extends JpaRepository<Home, Long> {
}