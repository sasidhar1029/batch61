package com.vcube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vcube.Entity.Order;
import com.vcube.repo.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private final OrderRepository repo;

	@Autowired
	public OrderController(OrderRepository repo) {
		this.repo = repo;
	}

	// ✅ Create Order
	@PostMapping
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		Order savedOrder = repo.save(order);
		return ResponseEntity.ok(savedOrder);
	}

	// ✅ Get Order By Id
	@GetMapping("/{id}")
	public ResponseEntity<Order> getOrder(@PathVariable Long id) {

		return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
}
