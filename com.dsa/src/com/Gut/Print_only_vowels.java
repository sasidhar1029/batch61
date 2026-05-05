package com.Gut;

public class Print_only_vowels {

	public static void main(String[] args) {
		String s = "Sasidhar";
		for (char c : s.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.print(c + " ");
			}
			else {
				System.out.print(c+" ");
			}
		}
	}

}
