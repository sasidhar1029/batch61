package com.vcube.Laptop.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.Laptop.model.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop,Integer>{

	Optional<Laptop> findByName(String name);
	

}
