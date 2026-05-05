package com.pratice;

class bike {
	void dis() {
		System.out.println("Duke");
	}
}

class Car extends bike {
	void dis() {
		System.out.println("benz");
	}
}

public class P1 {

	public static void main(String[] args) {
		bike c = new Car();
		c.dis();
		c.dis();
	}

}
