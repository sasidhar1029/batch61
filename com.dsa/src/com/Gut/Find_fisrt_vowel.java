package com.Gut;

public class Find_fisrt_vowel {

	public static void main(String[] args) {
		String s = "Sasidhar";
		int count = 0;
		for (char c : s.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
				if (count == 1) {
					System.out.println(c);
					break;
				}

			}
		}

	}

}
