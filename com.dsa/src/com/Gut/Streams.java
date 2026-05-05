package com.Gut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private double salary;
	private String branch;

	public Employee(int id, String name, double salary, String branch) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getBranch() {
		return branch;
	}
}

public class Streams {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "sasi", 10000.00, "ECE"),
				new Employee(2, "surya", 30000.00, "ECE"), new Employee(3, "Triven", 60000.00, "CSE"),
				new Employee(4, "naga", 70000.00, "Mech"), new Employee(5, "arjun", 90000.00, "Cicil"),
				new Employee(6, "reddy", 80000.00, "EEE"));
		List<String> department = empList.stream().filter(e -> e.getSalary() > 50000.00)
				.filter(s -> s.getName().toUpperCase().startsWith("T")).map(e -> e.getBranch()).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(department);
	}

}
