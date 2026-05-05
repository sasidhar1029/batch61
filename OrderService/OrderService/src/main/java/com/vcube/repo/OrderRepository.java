package com.vcube.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
