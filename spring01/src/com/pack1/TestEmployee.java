package com.pack1;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("sasi");
		
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
	}

}
