package com.flow_of_program;

import java.util.Scanner;

public class Leaf_or_not {
	static boolean isLeaf_or_not(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		System.out.println(isLeaf_or_not(year) ? "is a Leaf year" : "Not a Leaf year");
		sc.close();

	}

}
