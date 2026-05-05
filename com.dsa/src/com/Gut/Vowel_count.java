package com.Gut;

import java.util.HashMap;

public class Vowel_count {

	public static void main(String[] args) {
		String s = "Sasidhar Reddy";
		int count = 0;

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.print(c + " ");
				count++;
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println();
		System.out.println(map);
		System.out.println("Vowles count:" + count);
	}

}
