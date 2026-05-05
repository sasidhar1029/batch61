package com.GutTasks;

import java.util.Scanner;

public class StringTasks {

	public static void Reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reversed String : " + rev);
	}

	public static void VowelCount(String s) {
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {

			char c = s.toLowerCase().charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println("Vowels Count : " + count);
	}

	public static void IsDuplicate(String s) {

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			char ch = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				char ch1 = s.charAt(j);
				if (ch == ch1) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		Reverse(s);
		VowelCount(s);
		IsDuplicate(s);
	}

}
