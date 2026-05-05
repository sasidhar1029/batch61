package com.GutTasks;

import java.util.Scanner;

public class Number_Analyzer_tool {

	public static void EvenOrOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("Even:" + n);
		} else {
			System.out.println("odd:" + n);
		}
	}

	public static void Palindrome(int n) {
		int temp = n;
		int rev = 0;
		while (n != 0) {
			int m = n % 10;
			rev = rev * 10 + m;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("palindrome:" + temp);
		} else {
			System.out.println("Not a Palindrome:" + temp);
		}
	}

	public static boolean isPrime(int n) {
		boolean status = true;
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}

		}
		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		EvenOrOdd(n);
		Palindrome(n);
		if (isPrime(n)) {
			System.out.println("prime Number:" + n);
		} else {
			System.out.println("Not a prime number:" + n);
		}
		sc.close();
	}

}
