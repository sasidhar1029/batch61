package com.tcs;

import java.util.Scanner;

public class T1 {
	static int N = 10;
	static int K = 5;
	static int candies = N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a candies you want");
		int order = sc.nextInt();
		if (order > candies || candies - order < K) {

			System.out.println("Invalid INput");
			System.out.println("candies are left: " + candies);
		} else {
			candies = candies - order;
			System.out.println("Number od candies buy:" + order);
			System.out.println("Number of Candies Left:" + candies);
			if (candies == K) {
				candies = N;
				System.out.println("The Jar refielded:" + candies);

			}
		}
	}

}
