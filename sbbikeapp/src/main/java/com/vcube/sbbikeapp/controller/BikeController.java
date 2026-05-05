package com.vcube.sbbikeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbbikeapp.model.Bike;
import com.vcube.sbbikeapp.repo.BikeRepo;

@RestController
@RequestMapping("api/v1")
public class BikeController {
	@Autowired
	BikeRepo bikerepo;
	
	@PostMapping("insertBikes")
	Bike insertBikes(@RequestBody Bike bike) {
		return bikerepo.save(bike);
	}
	
	@GetMapping("getAllBikes")
	List<Bike> getAllBikes(){
		return bikerepo.findAll();
	}
	
	@GetMapping("GetBikeById")
	Bike getById(@PathVariable int id) {
		return bikerepo.findById(id).orElse(null);
	}
	
	@GetMapping("GetBikeByBrand")
	Bike getByBrand(@PathVariable String brand) {
		return bikerepo.findByBrand(brand);
	}
	
	@PutMapping("updateBikes")
	Bike updateBike(@RequestBody Bike bike,@PathVariable int id) {
	Bike existing=	bikerepo.findById(id).orElse(null);
	 existing.setBrand(bike.getBrand());
	 existing.setModel(bike.getModel());
	 existing.setYear(bike.getYear());
	 existing.setPrice(bike.getPrice());
	 return bikerepo.save(existing);
	}
	
	
	String deleteBike(@PathVariable int id) {
		bikerepo.deleteById(id);
		return "delete the bike id:"+id;
	}
}
