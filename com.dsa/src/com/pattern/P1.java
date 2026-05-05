package com.pattern;

import java.util.Scanner;

public class P1 {
	static void print(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		int m1 = sc.nextInt();
		P1.print(n);
		P1.print(m1);
	}

}
