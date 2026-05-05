package com.Gut;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < str.length(); k++) {

					if (i != j && j != k && i != k) {
						System.out.println("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
					}
				}
			}
		}
		sc.close();
	}
}
