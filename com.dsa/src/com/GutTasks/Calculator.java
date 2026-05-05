package com.GutTasks;

import java.util.Scanner;

public class Calculator {

	static double add(double a, double b) {
		return a + b;
	}

	static double sub(double a, double b) {
		return a - b;
	}

	static double mul(double a, double b) {

		return a * b;
	}

	static double div(double a, double b) {
		if (b == 0) {
			System.out.println("Cant divide by zero");
			return 0;
		}
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number:");
		double a = sc.nextDouble();
		System.out.println();
		System.out.print("Enter a second number:");
		double b = sc.nextDouble();
		System.out.println();

		System.out.println("/n Choose a operation");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println();

		System.out.print("Enter your choice  :");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Result : " + add(a, b));
			break;

		case 2:
			System.out.println("Result  : " + sub(a, b));
			break;

		case 3:
			System.out.println("Result : " + mul(a, b));
			break;

		case 4:
			System.out.println("Result : " + String.format("%.2f", div(a,b)));
			break;

		default:
			System.err.println("invalid choice");
		}

	}

}
