package com.vcube.sbappTy01.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.sbappTy01.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Long>{

}
