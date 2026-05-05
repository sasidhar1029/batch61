package com.tasks;

import java.util.Scanner;

public class S2 {
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
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("count:" + count);
	}

}
