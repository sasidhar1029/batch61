package com.vcube.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.model.Bike;

public interface BikeRepo extends JpaRepository<Bike,Integer>{

}
