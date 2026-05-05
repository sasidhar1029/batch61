package com.tcs;

import java.util.Scanner;

public class Parking_charges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		if (n > 0) {

			if (n <= 2) {
				total = 100;
			} else if (  n <= 5) {
				total = 50 + 100;
			} else if (n > 5) {
				total += 50 + 100 + (n-5) * 20;
			}
		} else {
			System.out.println("error");
			return;
		}
		System.out.println(total);
	}

}
