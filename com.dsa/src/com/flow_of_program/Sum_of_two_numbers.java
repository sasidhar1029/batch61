package com.flow_of_program;

import java.util.Scanner;

public class Sum_of_two_numbers {
	static int sumOfTwoNumbers(int a, int b) {

		return (a + b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Sum of two numbers = " + sumOfTwoNumbers(a, b));
		sc.close();
	}

}
