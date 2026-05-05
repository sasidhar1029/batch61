package com.pattern;

import java.util.Scanner;

public class P6 {

	static void print(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			// star
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		P6.print(a);
	}
}
