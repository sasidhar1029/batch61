package com.vcube.sbbikeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.sbbikeapp.model.Bike;
@Repository
public interface BikeRepo extends JpaRepository<Bike,Integer> {

	Bike findByBrand(String brand);

}
