package com.vcube.restaurantservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.restaurantservice.model.FoodItems;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItems,Integer>{

	List<FoodItems> findByRestaurant_Id(Integer restaurantId);
}
