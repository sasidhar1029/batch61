package com.pattern;

import java.util.Scanner;

public class P2 {

	static void print(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		P2.print(a);
	}
}
