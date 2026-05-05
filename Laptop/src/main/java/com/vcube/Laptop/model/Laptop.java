package com.vcube.Laptop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Laptop")
@Data
@Setter
@Getter
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String brand;
	Double price;
	Long year;
}
