package com.tasks;

import java.util.Scanner;

public class CountPrimeIn_Array {

	public static boolean isPrime(int n) {
		boolean status = true;
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);	
//		System.out.println("Enter a number");
//		int n= sc.nextInt();
		int arr[] = { 3, 4, 7, 10, 13, 15 };
		int count = 0;
		for (int num : arr) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("count:" + count);

	}

}
