package com.vcube.Laptop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Laptop.model.Laptop;
import com.vcube.Laptop.repo.LaptopRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
//@RequestMapping("api/v1")

public class LaptopController {

	@Autowired
	LaptopRepo laptoprepo;

	@PostMapping("/insertLaptops")
	public Laptop insertLaptops(@ModelAttribute Laptop laptop) {
	    return laptoprepo.save(laptop);
	}

	@GetMapping("/getAllLaptops")
	List<Laptop> getAllLaptops() {
		return laptoprepo.findAll();
	}

	@GetMapping("/getById/{id}")
	Optional<Laptop> getByid(@PathVariable("id") int id) {
		return laptoprepo.findById(id);
	}

	@GetMapping("/getByName/{name}")
	Optional<Laptop> getByName(@PathVariable("name") String name) {
		return laptoprepo.findByName(name);
	}

	@PutMapping("/updateMapping/{id}")
	public Laptop updateLaptop(@RequestBody Laptop laptop, @PathVariable int id) {

		Laptop existing = laptoprepo.findById(id).orElseThrow(() -> new RuntimeException("Laptop not found"));

//		existing.setName(laptop.getName());
//		
//		existing.setPrice(laptop.getPrice());
//		existing.setYear(laptop.getYear());
		existing.setBrand(laptop.getBrand());

		return laptoprepo.save(existing);
	}
	
	@DeleteMapping("deletelaptop/{id}")
	public String deleteLaptop(@PathVariable ("id") int id) {
		laptoprepo.deleteById(id);
		return "delete laptop successfully my id:"+id;
	}
}
