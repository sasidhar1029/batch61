package com.vcube.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Repo.BikeRepo;
import com.vcube.model.Bike;

@RestController
public class BikeController {

	@Autowired
	BikeRepo bikerepo;
	
	@PostMapping("insertBikes")
	public Bike insertBike(@RequestBody Bike bike) {
		return bikerepo.save(bike);
	}
	
	@GetMapping("getAllBikes")
	List<Bike> getAllBikes(@PathVariable int bid){
		return bikerepo.findAll();
	}
	
	@GetMapping("getById/{bid}")
	Optional<Bike> getById(@PathVariable int bid) {
		return bikerepo.findById(bid);
	}
	
	@PutMapping("/updateBikeById/{bid}")
	public Bike updateById(@RequestBody Bike bike, @PathVariable int bid) {

	    Bike existing = bikerepo.findById(bid)
	            .orElseThrow(() -> new RuntimeException("Bike not found with id " + bid));

	    existing.setBname(bike.getBname());
	    existing.setBprice(bike.getBprice());
	    existing.setByear(bike.getByear());

	    return bikerepo.save(existing);
	}


}
