package com.pattern;

import java.util.Scanner;

public class P4 {

	static void print(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		P4.print(a);
	}
}
