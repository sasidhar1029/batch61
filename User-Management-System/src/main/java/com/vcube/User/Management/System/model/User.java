package com.vcube.User.Management.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id;
	
	@NotBlank(message="name should not be empty")
	String name;
	
	@Min(value=18,message="age must be atleast 18")
	@Max(value =60,message="age must be less than 60")
	int age;
	
	@Positive(message ="income must be positive")
	double income;
}
