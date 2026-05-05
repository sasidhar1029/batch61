package com.vcube.sbbikeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="bike2")
@Data
public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String brand;
	String model;
	String year;
	double price;
}
